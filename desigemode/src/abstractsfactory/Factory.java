package abstractsfactory;

/**
 * 抽象工厂
 */
public abstract class Factory {
    //生产饮料
    abstract Product getProductA();
    //生产零食
    abstract Product getProductB();

}
