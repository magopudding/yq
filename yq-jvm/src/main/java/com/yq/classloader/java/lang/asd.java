package com.yq.classloader.java.lang;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: String
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2021/3/26 17:14
 * @Version 1.0
 **/
public class asd {

  public volatile  String s = "awd";
  public static void main(String[] args) {
    Map<Integer, java.lang.String> h = new HashMap<>(16);
    for(int i = 1;i<=3000;i = i+16){
      h.put(i,"asa");
    }
    System.out.println(h.size());
  }

}
