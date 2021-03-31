package com.yq.classloader;

import com.sun.crypto.provider.DESKeyFactory;
import java.net.URL;
import sun.misc.Launcher;

/**
 * @ClassName: MyClassLoader
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2021/3/26 10:58
 * @Version 1.0
 **/
public class MyClassLoader {

  public static void main(String[] args) {
    System.out.println(Integer.class.getClassLoader());
    System.out.println(DESKeyFactory.class.getClassLoader());
    System.out.println(MyClassLoader.class.getClassLoader());
    System.out.println();

    ClassLoader app = ClassLoader.getSystemClassLoader();
    ClassLoader ext = app.getParent();
    ClassLoader boot = ext.getParent();
    System.out.println(app);
    System.out.println(ext);
    System.out.println(boot);

    System.out.println();
    URL[] urls = Launcher.getBootstrapClassPath().getURLs();
    for (URL url : urls) {
      System.out.println(url);
    }

    System.out.println();
    System.out.println("extclassLoader");
    System.out.println(System.getProperty("java.ext.dirs"));

    System.out.println();
    System.out.println(System.getProperty("java.class.path"));

    System.out.println(Launcher.getLauncher().getClassLoader());

  }

}
