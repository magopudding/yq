package one;

/**
 * @ClassName: BinarySearch
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2021/3/23 13:52
 * @Version 1.0
 **/
public class BinarySearch {

  public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6,7};
      System.out.println(search(arr,3));
  }
  public static int search(int[] arr,int target){
      if(arr == null || arr.length ==0){
          return -1;
      }
      if(arr.length == 1){
        return arr[0];
      }
      int left = 0;
      int right = arr.length -1;
      while (left <= right){
        int center = (left + right) /2;
        if(arr[center] > target){
            right = center -1;
        }
        if(arr[center] < target){
          left = center +1;
        }
        if(arr[center] == target){
          return center;
        }
      }
      return -1;
  }
}
