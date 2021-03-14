import com.kuang.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
//    @Test
//    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        userService.getUser();
//
//    }
    @Test
    public void UserTest(){
//        System.out.println(1);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.getUser();
    }
}
