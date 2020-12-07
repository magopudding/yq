public class DichotomyQuery {

    public int DichotomyQuery(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        int r = arr.length-1;
        int l = 0;
        while (l <= r){
            int center = (l + r) /2;
            if(arr[center] == target){
                return center;
            }
            if(arr[center] < target){
                l = center +1;
            }else {
                r = center-1;
            }

        }
        return -1;
    }

    /**
     * leet 统计一个数字在排序数组中出现的次数。offer 53
     */
    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        int l = 0;
        int r = nums.length -1;
        while (l <= r){
            int center = (l + r) /2;
            if(nums[center] <= target){
                l = center +1;
            }else {
                r = center -1;
            }
        }
        int right = l;
        if(r > 0 && nums[r] != target){
            return 0;
        }

        l = 0;
        r = nums.length -1;
        while (l <= r){
            int center = (l + r) /2;
            if(nums[center] < target){
                l = center +1;
            }else {
                r = center -1;
            }
        }
        int left = r;

        return right - left -1;
    }

    public static void main(String[] args) {
        DichotomyQuery a = new DichotomyQuery();
        int[] arr = {5,7,7,8,8};

        System.out.println(a.search(arr,8));
    }
}
