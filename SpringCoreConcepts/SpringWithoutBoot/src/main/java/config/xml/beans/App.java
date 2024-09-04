package config.xml.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Xml Main started");
        ApplicationContext context= new ClassPathXmlApplicationContext("config/xml/beans/config.xml");
        context.getBean("student1",Student.class);
        Student student1 = new Student();
        student1.sayHello();
        System.out.println(student1);
        Address address = student1.getAddress();
        System.out.println(address);
    }
}
