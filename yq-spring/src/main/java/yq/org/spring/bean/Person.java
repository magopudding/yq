package yq.org.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ClassName: Person
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2020/11/4 16:08
 * @Version 1.0
 **/
@Data
public class Person implements InitializingBean {

  private String name;

  private int age;


  public void afterPropertiesSet() throws Exception {
      this.age = 11;
      this.name = "adw";
  }
}
