package spring5.Testdemo;

/**
 * @author YANG
 * @create 2021-07-23 22:03
 */
public class Order {
    private String orderName;
    private Integer orderId;

    public Order(String orderName, Integer orderId) {
        this.orderName = orderName;
        this.orderId = orderId;
    }

    public void test() {
        System.out.println(orderId + ":" + orderName);
    }
}
