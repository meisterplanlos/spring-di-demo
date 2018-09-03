package io.chicker.misc.courses.spring5.didemo.controllers;




import io.chicker.misc.courses.spring5.didemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class SetterInjectedControllerTest
{
  private SetterInjectedController setterInjectedController;



  @Before
  public void setUp() throws Exception
  {
    this.setterInjectedController = new SetterInjectedController();
    this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
  }



  @Test
  public void testGreeting() throws Exception
  {
    Assert.assertEquals(GreetingServiceImpl.HELLO_WORLD, this.setterInjectedController.sayHello());
  }
}
