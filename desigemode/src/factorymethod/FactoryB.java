package factorymethod;

/**
 * 具体工厂B
 *负责生产具体产品B
 */
public class FactoryB extends Factory {
    @Override
    Product getProduct() {
        return new ProductB();
    }
}
