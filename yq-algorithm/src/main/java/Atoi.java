import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName: Atoi
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2020/11/17 17:03
 * @Version 1.0
 **/
public class Atoi {
  /*
   *
   * @Description //leetcode no8 字符串转整数
   * @Date  2020/11/17 17:04
   * @Param [s]
   * @return int
   **/
  public int myAtoi(String s) {

    if(s == null){
      return 0;
    }
    s = s.trim();
    if(s.isEmpty()){
      return 0;
    }
    int res = 0;
    char[] chars = s.toCharArray();
    char c = chars[0];
    boolean isf = false;
    if(c == 45){
      isf =true;
      chars[0] = '0';
    }
    if(c == 43){
      chars[0] = '0';
    }
    for (char aChar : chars) {
      int temp;
      if(aChar >= 48 && aChar <=57){
        temp = aChar - 48;
      } else{
        break;
      }
      if(isf){
        temp = temp* -1;
      }
      if(res > Integer.MAX_VALUE /10 || (res == Integer.MAX_VALUE/10 && temp >= Integer.MAX_VALUE % 10)){
        return Integer.MAX_VALUE;
      }
      if(res < Integer.MIN_VALUE /10 || (res == Integer.MIN_VALUE/10 && temp < Integer.MIN_VALUE % 10)){
        return Integer.MIN_VALUE;
      }
      res = res * 10 + temp;
    }
    return res;
  }

  public static void main(String[] args) {
    Atoi a = new Atoi();
    System.out.println(a.myAtoi("2147483648"));
    System.out.println(Integer.MIN_VALUE);
  }
}
