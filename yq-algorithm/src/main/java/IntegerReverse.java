import java.util.Stack;

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

    /**
     * leetcode no7 整数反转
     * @param x
     * @return
     */
  public int reverse(int x) {
      if(x == 0){
        return x;
      }
      Integer ans = 0;
      boolean flag = false;
      if(x < 0){
        x = x * -1;
        flag = true;
      }
      while (x != 0){
        int gw = x%10;
        if (ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE / 10 && gw > 7)) return 0;
        if (ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE / 10 && gw < -8)) return 0;
        ans = ans * 10 + gw;
        x = x /10;
      }
      if(flag){
          ans = ans * -1;
      }
      return ans;
  }
}
