package io.chicker.misc.courses.spring5.didemo.controllers;




import io.chicker.misc.courses.spring5.didemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.stereotype.Controller;




public class PropertyInjectedControllerTest
{
  private PropertyInjectedController propertyInjectedController;



  @Before
  public void setUp() throws Exception
  {
    this.propertyInjectedController = new PropertyInjectedController();
    this.propertyInjectedController.greetingService = new GreetingServiceImpl();
  }



  @Test
  public void testGreeting() throws Exception
  {
    Assert.assertEquals(GreetingServiceImpl.HELLO_WORLD, this.propertyInjectedController.sayHello());
  }
}
