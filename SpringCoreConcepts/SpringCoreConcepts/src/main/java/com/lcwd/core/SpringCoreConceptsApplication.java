package com.lcwd.core;

import com.lcwd.core.couple.*;
import com.lcwd.core.scope.Pepsi;
import com.lcwd.core.scope.Soda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@SpringBootApplication
//@ComponentScan(basePackage={"com.lcwd.core","test"})
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {

	//about the beans
	//@Component

	// about the dependencies
	 //@Autowired

   //where to scan for beans
   //@ComponentScan(basepackage={,,})
   //com.lcwd.core.couple

	/*Animal animal	=new Cat();
		Person p = new Person(animal);
		p.PlayWithAnimal();
		*/
	ApplicationContext context= SpringApplication.run(SpringCoreConceptsApplication.class, args);
//	Person PersonBean=context.getBean(Person.class);
//	PersonBean.PlayWithAnimal();
//		System.out.println(PersonBean);


//pepsi class for first request
//		Pepsi bean = context.getBean(Pepsi.class);
//		System.out.println(bean);
//		bean.drink();

	//second request for pepsi bean
//		Pepsi bean1 = context.getBean(Pepsi.class);
//		System.out.println(bean1);


//		Pepsi pepsi = context.getBean(Pepsi.class);
//		System.out.println(pepsi);
//		Soda soda = pepsi.getSoda();
//		System.out.println(soda);
//
//		Pepsi pepsi1 = context.getBean(Pepsi.class);
//		System.out.println(pepsi1);
//		Soda soda1 = pepsi1.getSoda();
//		System.out.println(soda1);

	}
	//declaring the bean using @Bean
//	@Bean(name="samosa1")
//	@Primary
//	public Samosa getSamosa1(){
//		return new Samosa("This is sweet samosa");
//	}
//	@Bean(name="samosa2")
////	@Primary
//	public Samosa getSamosa2(){
//		return new Samosa("Tandoori samosa");
//	}


}
