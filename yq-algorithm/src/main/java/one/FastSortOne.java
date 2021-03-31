package one;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @ClassName: FastSortOne
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2021/3/22 14:07
 * @Version 1.0
 **/
public class FastSortOne {

  public static void main(String[] args) {
    int[] arr = {2,6,1,2,0,5,3,4};
    fastSort(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
    int[][] a = {{1,2},{3,4},{5,6},{7,8}};
    System.out.println(a[0][0]);
  }
  public static void fastSort(int[] arr, int left, int right){
      if(arr == null || arr.length == 0 || arr.length == 1){
          return;
      }
      if(left >= right){
        return;
      }
      int l = left;

      int r = right;

      int target = arr[left];

      while (l < r){
          while (l < r && arr[r] >= target) r--;
          if(l < r){
              arr[l] = arr[r];
              l++;
          }
          while (l < r && arr[l] < target) l++;
          if(l < r){
            arr[r] = arr[l];
            r--;
          }
      }
      arr[l] = target;
      fastSort(arr,left,l-1);
      fastSort(arr,l+1,right);
  }


}
