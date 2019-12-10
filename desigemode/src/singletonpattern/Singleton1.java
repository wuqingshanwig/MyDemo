package singletonpattern;

/**
 * 懒汉式,线程不安全
 * 不支持多线程，因为没有加锁 synchronized
 */
public class Singleton1 {
    //声明单例的引用
    private static Singleton1 instance;//instance汉语意思是实例的意思
    //创建私有构造函数，防止创建新的实例
    private Singleton1 (){}
    //创建单例
    public static Singleton1 getInstance() {
        //判断实例是否为空
        if (instance == null) {
            //创建实例
            instance = new Singleton1();
        }
        //对外提供的唯一实例
        return instance;
    }
    public void showData() {
        System.out.println(getClass());
    }
}
