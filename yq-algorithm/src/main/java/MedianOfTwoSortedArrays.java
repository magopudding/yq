import java.util.Arrays;

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
    int[] a = new int[]{1,2};
    int[] b = new int[]{3,4};
    System.out.println(141246 % 32);

    System.out.println(s.findMedianSortedArrays(a,b));
  }
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int length1 = nums1.length;
    int length2 = nums2.length;
    int sumLen = length1 + length2;

    int center1 = sumLen / 2;

    int i = 0;
    int j = 0;
    int sumIJ = 0;
    double center2 = -1d;
    double center3 = -1d;
    while (true){
      if(sumLen % 2 == 0 && center2 != -1 && center3 != -1){
          break;
      }
      if(sumLen %2 != 0 && center2 != -1){
        break;
      }
      double temp1 = 0;
      double temp2 = 0;
      if(i < length1){
          temp1 = nums1[i];
      }
      if(j < length2){
          temp2 = nums2[j];
      }
      if((temp1 < temp2) || (j == length2 -1 && i < length1 -1)){
        if(sumIJ == center1 -1){
          center2 = temp1;
        }
        if(sumIJ == center1){
          center3 = temp1;
        }
        if(i < length1 -1){
          ++i;
          ++sumIJ;
        }else {
          ++j;
          ++sumIJ;
        }
      }else {
        if(sumIJ == center1 -1){
          center2 = temp2;
        }
        if(sumIJ == center1){
          center3 = temp2;
        }
        if(j < length2){
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
