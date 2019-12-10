package singletonpattern;

public class TestSingleton {
    public static void main(String[] args) {
        //调用方式
        Singleton1 instance = Singleton1.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        Singleton3 instance3 = Singleton3.getInstance();
        Singleton4 instance4 = Singleton4.getInstance();
        Singleton5 instance5 = Singleton5.getInstance();
        Singleton6 instance6 = Singleton6.INSTANCE;
        instance.showData();
        instance2.showData();
        instance3.showData();
        instance4.showData();
        instance5.showData();
        instance6.showData();
    }
}
