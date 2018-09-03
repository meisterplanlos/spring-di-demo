package io.chicker.misc.courses.spring5.didemo;




import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Controller;




@Controller
public class CustomBeanPostProcessor implements BeanPostProcessor
{
  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
  {
    if(bean instanceof LifeCycleDemoBean)
    {
      ((LifeCycleDemoBean) bean).beforeInit();
    }

    return bean;
  }



  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
  {
    if(bean instanceof LifeCycleDemoBean)
    {
      ((LifeCycleDemoBean) bean).afterInit();
    }

    return bean;
  }
}
