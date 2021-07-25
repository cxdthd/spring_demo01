package spring5.Testdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.User;

/**
 * @author YANG
 * @create 2021-07-22 23:07
 */
public class TestSpring5 {

    @Test
    public void test(){
        //1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();

    }

    @Test
    public void testBook(){
        //1.加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置文件创建的对象
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        book.test();
    }

    @Test
    public void testOrder(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Order order = context.getBean("order", Order.class);
        Order order1 = context.getBean("order1", Order.class);

        order.test();
        order1.test();
    }

}
