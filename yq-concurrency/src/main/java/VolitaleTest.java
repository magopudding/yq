
/**
 * @ClassName: VolitaleTest
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2020/12/15 16:58
 * @Version 1.0
 **/
public class VolitaleTest {

  public static Integer i = 1;

  public void t1(){
    new Thread(() -> {
      System.out.println("t1::i="+i);
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      i = i+1;
      System.out.println("t1::i="+i);
    }).start();
  }

  public void t2(){
    new Thread(() -> {
      System.out.println("t2::i="+i);
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("t2::i="+i);
    }).start();
  }

  public static void main(String[] args) {
    VolitaleTest s = new VolitaleTest();
    s.t1();
    s.t2();
  }
}
