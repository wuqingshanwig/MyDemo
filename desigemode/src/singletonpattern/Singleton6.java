package singletonpattern;

/**
 * 枚举
 * 创建单例、线程安全、实现简洁的需求
 */
public enum Singleton6 {
    //定义1个枚举的元素，即为单例类的1个实例
    INSTANCE;
    // 隐藏了1个空的、私有的 构造方法
    // private Singleton () {}

    // 获取单例的方式：
   // Singleton singleton = Singleton.INSTANCE;
    public void showData() {
        System.out.println(getClass());
    }
}
