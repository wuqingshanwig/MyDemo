package factorymethod;

/**
 * 具体工厂A
 * 负责生产具体产品A
 */
public class FactoryA extends Factory {
    @Override
    Product getProduct() {
        return new ProductA();
    }
}
