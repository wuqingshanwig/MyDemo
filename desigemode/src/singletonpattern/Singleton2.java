package singletonpattern;

/**
 * 懒汉式-线程安全
 * 在第一种方式的基础上添加了synchronized
 * 必须加锁 synchronized 才能保证线程安全，
 * 缺点：每次访问都要进行线程同步（即 调用synchronized锁)，
 * 造成过多的同步开销（加锁 = 耗时、耗能）
 *
 *
 */
public class Singleton2 {
    //声明单例的引用
    private static Singleton2 instance;
    //创建私有构造函数，防止创建新的实例
    private Singleton2 (){}
    //添加了synchronized 在多线程下保证线程安全
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
    public void showData() {
        System.out.println(getClass());
    }
}
