import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: TwoNoSum
 * @Descraption: 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9

 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 **/
public class TwoNoSum {

  /*
   *
   * @Description //通过map寻找 target-x
   * @Date  2020/11/2 14:28
   * @Param [nums, target]
   * @return int[]
   **/
  public int[] twoSum(int[] nums, int target) {
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
}
