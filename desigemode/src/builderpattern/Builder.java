package builderpattern;

/**
 * 建造者模式又被称呼为生成器模式，这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 使用多个简单的对象一步一步构建成一个复杂的对象
 *
 * 假设造房简化为如下步骤：（1）地基（2）钢筋工程（3）铺电线（4）粉刷
 * “如果”要盖一座房子，首先要找一个建筑公司或工程承包商（指挥者）。
 * 承包商指挥工人（具体建造者）过来造房子（产品），最后验收。
 *
 * 建造者
 *
 */
public abstract class Builder {
    //地基
    abstract void bulidA();
    //钢筋工程
    abstract void bulidB();
    //铺电线
    abstract void bulidC();
    //粉刷
    abstract void bulidD();
    //完工-获取产品
    abstract Product getProduct();
}
