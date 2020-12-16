package yq.org.spring.bean;

import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: start
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2020/11/4 16:14
 * @Version 1.0
 **/
@SpringBootApplication(scanBasePackages = "yq.org.spring")
public class Start {

  public static void main(String[] args) {
    SpringApplication.run(Start.class,args);
    AnnotationConfigApplicationContext s = new AnnotationConfigApplicationContext(BeanFactoryTests.class);
    Object beanFactoryTests = s.getBean("&beanFactoryTests");
    System.out.println(s.getBean("beanFactoryTests"));
    System.out.println(s.getBean(Person.class));
  }
}
