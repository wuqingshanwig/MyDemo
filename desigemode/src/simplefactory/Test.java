package simplefactory;

/**
 * 一个抽象产品类，可以派生出多个具体产品类。
 * 一个具体工厂类，通过往此工厂的static方法中传入不同参数，产出不同的具体产品类实例。
 */
public class Test {
    public static void main(String[] args) {
        //创建具体的工厂
        Factory factory = new Factory();
        //根据传入的参数生产不同的产品实例
        //(按下不同的按钮，获取饮料)
        Product A = Factory.getProduct("A");
        A.intro();
        Product B = Factory.getProduct("B");
        B.intro();
        Product C = Factory.getProduct("C");
        C.intro();
    }
}
