import com.wsw.config.SpringConfig;
import com.wsw.controller.UserController;
import com.wsw.dao.UserDao;
import com.wsw.domain.User;
import com.wsw.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author loriyuhv
 * @ClassName App
 * @date 2024/4/9 20:10
 * @description TODO
 */

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService bean = ctx.getBean(UserService.class);
        System.out.println(bean);
        System.out.println(ctx.getBean(UserController.class));
    }
}
