package io.chicker.misc.courses.spring5.didemo.controllers;




import io.chicker.misc.courses.spring5.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;




@Controller
public class SetterInjectedController
{
  private GreetingService greetingService;



  public String sayHello()
  {
    return greetingService.sayGreeting();
  }



  @Autowired
  public void setGreetingService(@Qualifier("setterBasedGreetingService") GreetingService greetingService)
  {
    this.greetingService = greetingService;
  }
}
