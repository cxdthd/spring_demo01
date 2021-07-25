package spring5.Testdemo;

/**
 * @author YANG
 * @create 2021-07-23 21:14
 */
public class Book {
    //创建属性
    private String bookName;
    private String boonAuthor;
    private String address;

    //创建属性对应的set()方法
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBoonAuthor(String boonAuthor) {
        this.boonAuthor = boonAuthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //该方法做测试用
    public void test() {
        System.out.println(boonAuthor + ":" + bookName + ":" + address);
    }
}
