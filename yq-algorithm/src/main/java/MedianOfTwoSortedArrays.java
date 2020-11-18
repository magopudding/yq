
/**
 * @ClassName: MedianOfTwoSortedArrays
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2020/11/4 10:50
 * @Version 1.0
 **/
public class MedianOfTwoSortedArrays {

  public static void main(String[] args) {
    MedianOfTwoSortedArrays s = new MedianOfTwoSortedArrays();
    int[] a = new int[]{3};
    int[] b = new int[]{-2,-1};
    System.out.println(s.findMedianSortedArrays(a,b));
  }

  /*
   *
   * @Description leetcode no4 寻找两个正序数组的中位数
   * @Date  2020/11/12 17:06
   * @Param [nums1, nums2]
   * @return double
   **/
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int length1 = nums1.length;
    int length2 = nums2.length;
    int sumLen = length1 + length2;
    if(length1 == 0 && length2 == 0){
      return 0;
    }
    int center1 = sumLen / 2;

    int i = 0;
    int j = 0;
    int sumIJ = 0;
    if(sumLen % 2 == 0){
      sumIJ = 1;
    }

    double center2 = Double.MAX_VALUE;
    double center3 = Double.MAX_VALUE;
    while (true){
      if(sumLen % 2 == 0 && center2 != Double.MAX_VALUE && center3 != Double.MAX_VALUE){
        break;
      }
      if(sumLen %2 != 0 && center2 != Double.MAX_VALUE){
        break;
      }
      double temp1 = Double.MAX_VALUE;
      double temp2 = Double.MAX_VALUE;
      if(i < length1){
          temp1 = nums1[i];
      }
      if(j < length2){
          temp2 = nums2[j];
      }
      if((temp1 <= temp2 && i < length1) || (i< length1 && j >= length2)){
          if(sumIJ == center1){
            center2 = temp1;
          }
          if(sumIJ == center1 + 1){
            center3 = temp1;
          }
          ++i;
          ++sumIJ;
      }else {
        if(sumIJ == center1){
          center2 = temp2;
        }
        if(sumIJ == center1 + 1){
          center3 = temp2;
        }
        if(j <= length2 -1){
          ++j;
          ++sumIJ;
        }
      }
    }
    if(sumLen % 2 == 0){
      return (center2+center3)/2;
    }else {
      return center2;
    }
  }

}
