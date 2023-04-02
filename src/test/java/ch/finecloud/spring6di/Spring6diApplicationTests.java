package ch.finecloud.spring6di;

import ch.finecloud.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6diApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private MyController myController;

	@Test
	void contextLoads() {
	}

	@Test
	void testGetControllerFromApplicationContext() {
		myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}
}
