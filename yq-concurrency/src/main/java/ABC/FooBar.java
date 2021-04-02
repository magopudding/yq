package src.main.java.ABC;


public class FooBar {

  public static void main(String[] args) throws InterruptedException {
    FooBar f= new FooBar(15);
    f.foo();
    f.bar();
  }
  private int n;

  private Object object = new Object();

  private String flag = "foo";

  public FooBar(int n) {
    this.n = n;
  }

  public void foo() throws InterruptedException {
    new Thread(() -> {
      for (int i = 0; i < n; i++) {
          synchronized (object){
            try {
              while (!flag.equals("foo")){
                object.wait();
              }
              System.out.print("foo");
              flag = "bar";
              object.notifyAll();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }

          }
      }
    }).start();
  }

  public void bar() throws InterruptedException {
    new Thread(() -> {
      for (int i = 0; i < n; i++) {
        synchronized (object){
          try {
            while (!flag.equals("bar")){
              object.wait();
            }
            System.out.println("bar");
            flag = "foo";
            object.notifyAll();
          }catch (Exception e){

          }
        }
      }
    }).start();
  }
}
