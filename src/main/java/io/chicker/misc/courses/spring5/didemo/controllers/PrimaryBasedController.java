package io.chicker.misc.courses.spring5.didemo.controllers;




import io.chicker.misc.courses.spring5.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;




@Controller
public class PrimaryBasedController
{
  private GreetingService greetingService;



  @Autowired
  public PrimaryBasedController(GreetingService greetingService)
  {
    this.greetingService = greetingService;
  }



  public String sayHello()
  {
    return this.greetingService.sayGreeting();
  }
}
