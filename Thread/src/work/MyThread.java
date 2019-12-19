package work;

import java.io.File;
import java.util.concurrent.Callable;

/**
 * @author: wig
 * @Date: 2019/12/19 13:13
 * @ClassName MyThread
 * @Description:
 */
public class MyThread implements Callable <Long>{
    private static int count1 = 0;
    private static int count2 = 0;
    @Override
    public Long call() throws Exception {
        long startTime = System.currentTimeMillis();
        File file = new File("D:\\IOtest");
        f1(file);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    public  void f1(File f) {
        if (f.exists()) {
            File[] listFiles = f.listFiles();
            for(File ff : listFiles) {
                if (ff.isDirectory()) {
                    f1(ff);
                    System.out.println("目录:" + ff.getAbsolutePath());
                    count1++;
                } else {
                    count2++;
                    System.out.println("文件:" + ff.getAbsolutePath());
                }
            }
        } else {
            System.out.println("抱歉，文件不存在!");
        }
        System.out.println("文件个数为" + count2);
        System.out.println("目录个数为" + count1);

    }
}
