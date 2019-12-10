package simplefactory;

/**
 * 工厂,负责实现创建所有实例的内部逻辑，并提供一个外界调用的方法，创建所需的产品对象
 */
public class Factory {
    public static  Product getProduct(String type){
        switch (type) {
            case "A":
                return new Aproduct();
            case "B":
                return new Bproduct();
            case "C":
                return new Cproduct();
            default:
                return null;

        }
    }

}
