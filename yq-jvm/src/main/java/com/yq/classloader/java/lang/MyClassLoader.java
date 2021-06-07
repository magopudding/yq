package com.yq.classloader.java.lang;

/**
 * @ClassName: MyClassLoader
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2021/6/3 18:14
 * @Version 1.0
 **/
public class MyClassLoader extends ClassLoader {

  @Override
  protected Class<?> findClass(String name) throws ClassNotFoundException {
    return defineClass(name,new byte[1],0,1);
  }

  @Override
  protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
    synchronized (getClassLoadingLock(name)){
      Class<?> c = findLoadedClass(name);
      if(c == null) {
        if(name.contains("com.kxy")){
          c = findClass(name);
        }else {
          c = this.getParent().loadClass(name);
        }
      }
      return c;
    }
  }
}
