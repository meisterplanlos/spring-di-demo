package io.chicker.misc.courses.spring5.didemo;




import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;




@Component
public class LifeCycleDemoBean
    implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware
{
  public LifeCycleDemoBean()
  {
    System.out.println("LifeCycleDemoBean constructor called");
  }



  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException
  {
    System.out.println("Set BeanFactory to " + beanFactory);
  }



  @Override
  public void setBeanName(String s)
  {
    System.out.println("Set BeanName to " + s);
  }



  @Override
  public void destroy() throws Exception
  {
    System.out.println("Destroy Bean");
  }



  @Override
  public void afterPropertiesSet() throws Exception
  {
    System.out.println("After Properties Set");
  }



  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
  {
    System.out.println("Set ApplicationContext to " + applicationContext);
  }



  @PostConstruct
  public void postConstruct()
  {
    System.out.println("Post Construct");
  }



  @PreDestroy
  public void preDestroy()
  {
    System.out.println("Pre Destroy");
  }



  public void beforeInit()
  {
    System.out.println("Pre Destroy (called by BeanPostProcessor");
  }



  public void afterInit()
  {
    System.out.println("After Init (called by BeanPostProcessor)");
  }
}
