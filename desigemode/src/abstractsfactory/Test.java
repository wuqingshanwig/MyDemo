package abstractsfactory;

/**
 * 根据实例可以描述为： 多个抽象产品类，每个抽象产品类可以派生出多个具体产品类。一个抽象工厂类，
 * 可以派生出多个具体工厂类。 每个具体工厂类可以创建多个具体产品类的实例。
 */
public class Test {
    public static void main(String[] args) {
        //创建零食售卖机（具体工厂），
        FactoryWork factoryA = new FactoryWork();
        //获取矿泉水与面包（具体产品）
        factoryA.getProductA().intro();
        factoryA.getProductB().intro();
    }
}
