package io.chicker.misc.courses.spring5.didemo.controllers;




import io.chicker.misc.courses.spring5.didemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class ConstructorInjectedControllerTest
{
  private ConstructorInjectedController constructorInjectedController;



  @Before
  public void setUp() throws Exception
  {
    this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
  }



  @Test
  public void testGreeting() throws Exception
  {
    Assert.assertEquals(GreetingServiceImpl.HELLO_WORLD, this.constructorInjectedController.sayHello());
  }
}
