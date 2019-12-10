package abstractsfactory;

/**
 * 具体工厂
 */
public class FactoryWork extends Factory {
    @Override
    Product getProductA() {
        //生产矿泉水
        return new ProductAa();
    }

    @Override
    Product getProductB() {
        //生产面包
        return new ProductBb();
    }
}
