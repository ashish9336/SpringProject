package com.Icwd.withoutboot;

import another.word.Repo;
import com.Icwd.withoutboot.beans.CartService;
import com.Icwd.withoutboot.beans.OrderService;
import com.Icwd.withoutboot.beans.UserService;
import com.Icwd.withoutboot.config.AppConfig;
import com.Icwd.withoutboot.web.AuthController;
import com.Icwd.withoutboot.web.HomeController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Application started" );
        //we have to create object of application context

        //this is for annotation configuration
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context);
        CartService cartService1 = context.getBean("cartService1", CartService.class);
        cartService1.createCart();

        UserService bean = context.getBean(UserService.class);
        bean.saveUser();

        UserService bean1 = context.getBean(UserService.class);
        bean1.saveUser();
        OrderService  bean2 = context.getBean(OrderService.class);
        bean2.createOrder();

        HomeController ho = context.getBean(HomeController.class);
            ho.homepage();
        AuthController auth = context.getBean(AuthController.class);
        auth.login();
        Repo re = context.getBean(Repo.class);
        re.getUser();

//       this is for xml based configuration
//        ApplicationContext context= new ClassPathXmlApplicationContext();
    }
}
