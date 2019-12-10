package singletonpattern.em;

/**
 * 假设一家人都在使用一张信用卡(单例对象)，消费与还款都在同一张信用卡上。
 */
public enum Card {
    INSTANCE;

    //初始金额
    private int Amount = 20000;
    /**
     * 消费
     */
    public void consume(int sum) {
        System.out.println("消费了"+sum);
        this.Amount-=sum;
    }
    /**
     *  还款
     */
    public void repayment(int sum) {
        System.out.println("还款了"+sum);
        this.Amount+=sum;
    }
    /**
     *  查询
     */
    public void query() {
        System.out.println("信用卡额度："+Amount);
    }
}
