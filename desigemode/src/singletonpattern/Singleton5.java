package singletonpattern;

/**
 * 懒汉式 登记式/静态内部类
 *
 * 这种方式能达到双检锁方式一样的功效，但实现更简单
 *
 */
public class Singleton5 {
    //创建静态内部类、创建单例
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    //创建私有构造函数，防止创建新的实例
    private Singleton5 (){}
    //提供一个外部访问点来获取单例
    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
    public void showData() {
        System.out.println(getClass());
    }
}
