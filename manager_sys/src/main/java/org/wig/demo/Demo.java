package org.wig.demo;

import org.wig.utils.CodeUtil;
import org.wig.utils.EmailUtil;

/**
 * Author Name: wig
 * Class Name: Demo
 * Package Name: org.wig.demo
 * Date: 2020/1/20 16:59
 * Description:
 */
public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String s = CodeUtil.generateVerifyCode(10);
            EmailUtil.sendEmail("1921890771@qq.com",s);
        }
    }
}
