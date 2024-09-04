package com.lcwd.orm.learn_spring_orm;

import com.lcwd.orm.learn_spring_orm.entities.*;
import com.lcwd.orm.learn_spring_orm.repository.CategoryRepo;
import com.lcwd.orm.learn_spring_orm.repository.ProductRepo;
import com.lcwd.orm.learn_spring_orm.repository.StudentRepository;
import com.lcwd.orm.learn_spring_orm.services.UserService;
import jakarta.persistence.OneToOne;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
    private UserService userService;

	private Logger logger= LoggerFactory.getLogger(LearnSpringOrmApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setName("Ankit");
//		user.setCity("Delhi");
//		user.setAge(34);
//		User user1 = userService.saveUser(user);
//		System.out.println(user1);

		// I get single entity
		/*List<User> users = userService.getAllUser();
		logger.info("user size is {}",users);
		logger.info("Users : {}",users);*/

		/*User user = userService.getUser(1);
		logger.info("user is {}",user);*/
		/*User user = new User();
		user.setName("Ashish Chauhan");
		user.setAge(32);
		user.setCity("DELHI");
		User updateUser = userService.updateUser(user, 1);
		logger.info("updated user details : {}",updateUser);*/

		//Delete
//		userService.deleteUser(2);


		//		OneToOne mapping
		/*Student student = new Student();
		student.setStudentName(" Bablu Chauhan");
		student.setAbout("I am Software engineer");
		student.setStudentId(12);


		Laptop laptop = new Laptop();
		laptop.setModelNumber("1234");
		laptop.setBrand("Dell");
		laptop.setLaptopId(13);
		//important
		laptop.setStudent(student);

		student.setLaptop(laptop);

        //manual laptop save:
		//laptop repository
		Student save = studentRepository.save(student);
		logger.info("Save student: {}",save.getStudentName());*/



//		logger.info("Name {}",student.getStudentName());
//		Laptop laptop = student.getLaptop();
//		Student student = studentRepository.findById(13).get();
//		logger.info("laptop {} ,{}",laptop.getBrand(),laptop.getModelNumber());

		/*Student student = studentRepository.findById(12).get();
		logger.info("Name is {}",student.getStudentName());

		Laptop laptop = student.getLaptop();
		logger.info("Laptop {}, {}",laptop.getBrand(),laptop.getModelNumber());*/

       //One To Many

		/*Student student = new Student();
		student.setStudentName(" Ravi Chauhan");
		student.setAbout("I am Software engineer");
		student.setStudentId(15);


		//Address
		Address a1= new Address();
		a1.setAddressId(131);
		a1.setStreet("235/235");
		a1.setCity("Lucknow");
		a1.setCountry("INDIA");
		a1.setStudent(student);

		Address a2= new Address();
		a2.setAddressId(133);
		a2.setStreet("236/236");
		a2.setCity("Bangluru");
		a2.setCountry("INDIA");
		a2.setStudent(student);


		ArrayList<Address> addressList = new ArrayList<>();
		addressList.add(a1);
		addressList.add(a2);

		student.setAddressList(addressList);


		Student save = studentRepository.save(student);
		logger.info("Student created : with address ");

*/
		/*Product product1 = new Product();
		product1.setpId("pid1");
		product1.setProductName("Iphone 14 max Product");

		Product product2 = new Product();
		product2.setpId("pid2");
		product2.setProductName("Samsung s22 ultra");

		Product product3 = new Product();
		product3.setpId("pid3");
		product3.setProductName("Samsung Tv1234");

		Category category1 = new Category();
		  category1.setcId("cid1");
		  category1.setTitle("Electronics");

		  Category category2= new Category();
		  category2.setcId("cid2");
		  category2.setTitle("Mobile Phone");

		List<Product> category1Products = category1.getProducts();
		category1Products.add(product1);
		category1Products.add(product2);
		category1Products.add(product3);

		List<Product> category2Products = category2.getProducts();
		   category2Products.add(product1);
		   category2Products.add(product2);

		   categoryRepo.save(category1);
		   categoryRepo.save(category2);
*/
//		Category category = categoryRepo.findById("cid1").get();
//		System.out.println(category.getProducts().size());
//
//		Category category2=categoryRepo.findById("cid2").get();
//		System.out.println(category2.getProducts().size());

		/*Product product =productRepo.findById("pid1").get();
		System.out.println(product.getCategories().size());*/

		/*Optional<Product> byProductName = productRepo.findByProductName("Iphone 14 max Product");

		if (byProductName.isPresent()) {
			System.out.println(true); // Product is present
			System.out.println(byProductName.get().getProductName()); // Print the product name
		} else {
			System.out.println(false); // Product is not present
		}




		System.out.println("+++++++++++++++++++++++++++++++");
		List<Product> tra = productRepo.findByProductNameEndingWith(" ultra");
		tra.forEach(product -> {
			System.out.println(product.getProductName());
		});
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		List<Product> sung = productRepo.findByProductNameContaining("sung");
		sung.forEach(product -> {
			System.out.println(product.getProductName());
		});
		System.out.println("+++++++++++++++++++++++++++++");
		List<Product> samsungS22Ultra = productRepo.findByProductNameIn(Arrays.asList("Iphone 14 max Product", "Samsung s22 ultra"));
       samsungS22Ultra.forEach(product -> {
		   System.out.println(product.getProductName());
	   });
*/
		List<Product> allProductWhileLearningJPA = productRepo.getAllProductWhileLearningJPA();
		allProductWhileLearningJPA.forEach(product -> {
			System.out.println(product.getProductName());
		});

		productRepo.getAllActiveProducts().forEach(product ->{
			System.out.println(product.getProductName());
		});

	}
	@Autowired
	private CategoryRepo categoryRepo;
	@Autowired
	private ProductRepo productRepo;
}
