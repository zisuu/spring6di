package ch.finecloud.spring6di.controllers;

import ch.finecloud.spring6di.services.GreetingService;
import ch.finecloud.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm the controller");
        return greetingService.sayGreeting();
    }
}
