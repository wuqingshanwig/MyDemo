package com.maket;


import java.text.DateFormat;
import java.util.*;

public class EntityDao {
    private static Scanner input = new Scanner(System.in);
    private static List<Entity> memberList = new ArrayList<>();

    public void menu() {
        System.out.println("__________欢迎进入网吧会员管理系统______________");
        System.out.println("1注册会员        2积分兑换网费          3查询剩余积分          4修改密码         5充值          6下机");
        System.out.println("______________________________________________");
        System.out.println("请选择:");
    }

    public void register() {
        String name = "";
        String pwd = "";
        do {
            System.out.println("请输入姓名:");
            name = input.next();

            System.out.println("请设置你的密码");
            pwd = input.next();

            if (pwd.length() < 6) {
                try {
                    throw new MyException(pwd);
                } catch (MyException e) {
                    e.printStackTrace();
                    continue;
                }
            } else break;

        } while (true);
        UUID uuid = UUID.randomUUID();
        String uuidStr = uuid.toString();
        uuidStr = uuidStr.replace("-", "").replaceAll("[a-z]", "");
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getInstance();
        String format = dateFormat.format(date);
        System.out.println("注册成功!您的账号是:" + name + "密码是" + pwd+"卡号是"+uuidStr+"开卡时间是"+format);
    }
public void recharge(){//充值

}
}
