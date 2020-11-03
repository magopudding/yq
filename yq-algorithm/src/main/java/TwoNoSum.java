import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: TwoNoSum
 * @Descraption:
 **/
public class TwoNoSum {

  /*
   * @Description //两数之和  leetcode no1
   * @Date  2020/11/2 14:28
   * @Param [nums, target]
   * @return int[]
   **/
  public int[] twoSum(int[] nums, int target) {
      if(nums == null || nums.length == 0){
        return new int[]{};
      }
      Map<Integer,Integer> numMap = new HashMap<>();
      int length = nums.length;
      for(int i = 0; i< length; i++){
         if(numMap.containsKey(target - nums[i])){
            return  new int[]{numMap.get(target - nums[i]),i};
         }
         numMap.put(nums[i],i);
      }
      return new int[]{};
  }

  /*
   *
   * @Description //两数相加 leetcode no2
   * @Date  2020/11/2 16:41
   * @Param [l1, l2]
   * @return TwoNoSum.ListNode
   **/
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode result = new ListNode(0); //结果
      ListNode current = result; //类似于最终结果集的指针，填充完一个结果值之后，就指向下一个节点
      int temp = 0;//如果两个数相加的结果大于9，就将其十位记录下来，给下一位做进位用
      while (l1 != null || l2 != null){//当l1和l2都不等于空时执行
          int val1 = 0;
          if(l1 != null){
          val1 = l1.val;
          l1 = l1.next;
      }
      int val2 = 0;
      if(l2 != null){
          val2 = l2.val;
          l2 = l2.next;
      }
      int val3;

      val3 = val1 + val2 + temp;
      temp = 0;//将进位值加过之后重置
      if(val3 / 10 != 0){ //如果相加结果大于0
        temp = val3 / 10;//需要进位的数给temp
        val3 = val3 % 10;//个位留下
      }
      current.next = new ListNode(val3);
      current = current.next;
    }
    if(temp > 0){
      current.next = new ListNode(temp);
    }
    return result.next;
    }

  public static void main(String[] args) {
    TwoNoSum t = new TwoNoSum();

    ListNode l1 = t.new ListNode(3);
    ListNode l2 = t.new ListNode(4);
    ListNode l3 = t.new ListNode(2);
    l1.next = l2;
    l2.next = l3;

    ListNode l4 = t.new ListNode(9);
    ListNode l5 = t.new ListNode(6);
    ListNode l6 = t.new ListNode(9);
    l4.next = l5;
    l5.next = l6;
    ListNode listNode = t.addTwoNumbers(l1, l4);
  }
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

  }
}
