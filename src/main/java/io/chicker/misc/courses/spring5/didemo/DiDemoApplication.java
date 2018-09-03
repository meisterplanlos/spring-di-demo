package io.chicker.misc.courses.spring5.didemo;




import io.chicker.misc.courses.spring5.didemo.controllers.ConstructorInjectedController;
import io.chicker.misc.courses.spring5.didemo.controllers.PrimaryBasedController;
import io.chicker.misc.courses.spring5.didemo.controllers.PropertyInjectedController;
import io.chicker.misc.courses.spring5.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;




@SpringBootApplication
public class DiDemoApplication
{

  public static void main(String[] args)
  {
    ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

    System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
    System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
    System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    System.out.println(ctx.getBean(PrimaryBasedController.class).sayHello());
  }
}
