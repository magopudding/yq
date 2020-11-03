import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Substring
 * @Date: 2020/11/2 16:51
 * @Version 1.0
 **/
public class Substring {

  /*
   * 无重复字符最长子串长度   leetcode no3
   * @Date  2020/11/2 16:52
   * @Param [s]
   * @return int
   **/
  public int lengthOfLongestSubstring(String s) {
    byte[] bytes = s.getBytes();
    int largest = 0;
    int temp = 0;
    Map tempMap = new HashMap<>();
    for (int i=0 ;i< bytes.length; i++) {
      temp = 1;
      tempMap.put(bytes[i],1);
      for (int j=i+1;j<bytes.length;j++) {
        if(!tempMap.containsKey(bytes[j])){
          ++temp;
          tempMap.put(bytes[j],1);
        }else {
          tempMap.clear();
          break;
        }
      }
      if(temp > largest){
        largest = temp;
      }
    }
    return largest;
  }

    public static void main(String[] args) {
      Substring s = new Substring();
      System.out.println(s.lengthOfLongestSubstring("abcabcbb"));
    }
}
