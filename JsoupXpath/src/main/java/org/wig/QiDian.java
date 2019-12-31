package org.wig;

import org.apache.commons.io.FileUtils;
import org.seimicrawler.xpath.JXDocument;
import org.seimicrawler.xpath.JXNode;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author Name: wig
 * Class Name: QiDian
 * Package Name: org.wig
 * Date: 2019/12/31 9:21
 * Description:
 */
public class QiDian {
    public static void main(String[] args) throws IOException {

        for (int i = 1; i <= 5; i++) {
            String url = "https://www.qidian.com/free/all?orderId=&vip=hidden&style=1&pageSize=20&siteid=1&pubflag=0&hiddenField=1&page=" + i;

            JXDocument jxDoc = JXDocument.createByUrl(url);
            List<JXNode> hrefList = jxDoc.selN("//ul[@class=\"all-img-list cf\"]/li/div[1]/a/@href");

            for ( final JXNode href : hrefList) {
                ExecutorService pool = Executors.newCachedThreadPool();
                pool.submit(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            getOneBook("http:" + href);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }

    }

    // 爬取一本书
    private static void getOneBook(String url) throws IOException {
        JXDocument jxDoc = JXDocument.createByUrl(url);

        JXNode contentHref = jxDoc.selNOne("//a[@class=\"red-btn J-getJumpUrl \"]/@href");
        jxDoc = JXDocument.createByUrl("http:" + contentHref);

        JXNode bookName = jxDoc.selNOne("//div[@class=\"book-cover-wrap\"]/h1/text()");
        JXNode authorName = jxDoc.selNOne("//div[@class=\"book-cover-wrap\"]/h2/a/text()");

        String savePath = "E:/qidian/《" + bookName + "》" + authorName + "/";

        while (true) {
            getOneChapter(jxDoc, savePath);
            JXNode nextUrl = jxDoc.selNOne("//*[@id=\"j_chapterNext\"]/@href");
            if (nextUrl.asString().contains("lastpage")) {
                break;
            }
            jxDoc = JXDocument.createByUrl("http:" + nextUrl);
        }

        System.out.println(bookName + "，爬取完毕");
    }

    // 爬取一本
    private static void getOneChapter(JXDocument jxDoc, String savePath) throws IOException {

        JXNode title = jxDoc.selNOne("//h3[@class=\"j_chapterName\"]/span[1]/text()");
        String fileName = title.asString().replaceAll("[\\/:*?\"<>|]", " ");

        List<JXNode> textList = jxDoc.selN("//div[@class=\"read-content j_readContent\"]/p/text()");
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\r\n");
        for (JXNode text : textList) {
            sb.append(text).append("\r\n");
        }
        FileUtils.writeStringToFile(new File(savePath + fileName + ".txt"), sb.toString(), "utf-8");

        // System.out.println(title + ",爬取完毕");
    }



}
