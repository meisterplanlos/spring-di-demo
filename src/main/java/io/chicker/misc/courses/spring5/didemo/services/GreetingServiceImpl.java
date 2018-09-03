package io.chicker.misc.courses.spring5.didemo.services;




import org.springframework.stereotype.Service;




@Service
public class GreetingServiceImpl implements GreetingService
{
  public static final String HELLO_WORLD = "Property says Hi!";



  @Override
  public String sayGreeting()
  {
    return HELLO_WORLD;
  }
}
