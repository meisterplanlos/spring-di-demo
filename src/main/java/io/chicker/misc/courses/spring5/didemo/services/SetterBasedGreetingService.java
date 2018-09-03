package io.chicker.misc.courses.spring5.didemo.services;




import org.springframework.stereotype.Service;




@Service
public class SetterBasedGreetingService implements GreetingService
{
  @Override
  public String sayGreeting()
  {
    return "Setter says Hi!";
  }
}
