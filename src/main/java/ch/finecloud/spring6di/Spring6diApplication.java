package ch.finecloud.spring6di;

import ch.finecloud.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring6diApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Spring6diApplication.class, args);

		MyController myController = applicationContext.getBean(MyController.class);

		System.out.println("In main method");
		System.out.println(myController.sayHello());
	}

}
