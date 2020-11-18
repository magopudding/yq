/**
 * @ClassName: PalindromeNumber
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2020/11/17 16:01
 * @Version 1.0
 **/
public class PalindromeNumber {

  public static void main(String[] args) {
    PalindromeNumber d = new PalindromeNumber();
    System.out.println(d.isPalindrome(1214));
  }
  /*
   *
   * @Description //leetcode no9 回文数
   * @Date  2020/11/17 16:01
   * @Param [x]
   * @return boolean
   **/
  public boolean isPalindrome(int x) {
      if(x < 0){
          return false;
      }
      int y = x;
      int res = 0;
      while (y !=0){
        int x1 = y % 10;
        y = y / 10;
        res = res * 10 + x1;
      }
      return res == x;
  }

}
