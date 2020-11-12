

/**
 * @ClassName: IntegerReverse
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2020/11/6 16:13
 * @Version 1.0
 **/
public class IntegerReverse {

  public static void main(String[] args) {
    IntegerReverse s = new IntegerReverse();
    System.out.println(s.reverse(1534236469));
  }
  public int reverse(int x) {
      if(x == 0){
        return x;
      }
      StringBuffer sb = new StringBuffer();
      boolean flag = false;
      if(x < 0){
        x = x * -1;
        flag = true;
      }
      while (x != 0){
        int gw = x%10;
        sb.append(gw);
        x = x /10;
      }
      int res = Integer.parseInt(sb.toString());
      if(flag){
        res = res * -1;
      }
      return res;
  }
}
