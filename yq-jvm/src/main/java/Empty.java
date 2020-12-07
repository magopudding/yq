public class Empty {
    private Object object = new Object();
    public static void main(String[] args) {
        Empty e = new Empty();
        e.a();
        e.b();
    }

    public synchronized void a(){
        new Thread(() ->{
            System.out.println("a开始加锁");
            synchronized (object){
                System.out.println("a加锁成功");
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("a释放锁");
        }).start();
    }

    public void b(){
        new Thread(() ->{
            System.out.println("b开始加锁");
            synchronized (object){
                System.out.println("b加锁成功");
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("b释放锁");
        }).start();
    }
}
