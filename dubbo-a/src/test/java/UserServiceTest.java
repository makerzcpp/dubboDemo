import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;
import service.UserService;

import java.util.List;

/**
 * userService测试类
 *
 * @author solar
 * @date 2017/7/11
 */
public class UserServiceTest {
    private UserService userService;
    @Before
    public void setUp() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:dubbo/*.xml");
        userService = applicationContext.getBean(UserService.class);
    }

    @Test
    public void testQueryAll() {
        for(int i=0;i<500;i++) {
            List<User> userList = userService.queryAll();
            for (User user : userList) {
                System.out.println(user);
            }
            try {
                Thread.sleep(10 * i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
