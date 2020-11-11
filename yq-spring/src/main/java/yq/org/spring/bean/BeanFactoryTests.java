package yq.org.spring.bean;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @ClassName: BeanFactoryTests
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2020/11/4 15:12
 * @Version 1.0
 **/
@Component
public class BeanFactoryTests implements FactoryBean<Person> {

  public Person getObject() {
    Person p = new Person();
    p.setAge(123333);
    return p;
  }

  public Class<?> getObjectType() {
    return Person.class;
  }
}
