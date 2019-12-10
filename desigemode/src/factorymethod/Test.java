package factorymethod;

/**
 * 根据例子可以描述为：一个抽象产品类，可以派生出多个具体产品类。
 * 一个抽象工厂类，可以派生出多个具体工厂类。每个具体工厂类只能创建一个具体产品类的实例。
 */
public class Test {
    public static void main(String[] args) {
        //创建具体的工厂
        FactoryA factoryA = new FactoryA();
        //生产相对应的产品
        factoryA.getProduct().intro();
        FactoryB factoryB = new FactoryB();
        factoryB.getProduct().intro();
    }
    }

