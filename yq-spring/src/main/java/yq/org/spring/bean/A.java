package yq.org.spring.bean;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class A {

  @Resource
  private B b;
}
