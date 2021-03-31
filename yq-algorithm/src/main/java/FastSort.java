import com.alibaba.fastjson.JSONObject;

public class FastSort {
    public void fastSort(int[] arr,int left,int right){
        if(left >=right){
            return;
        }
        int k = arr[left];
        int i = left;
        int j = right;
        while (i < j){
            while (i < j && arr[j] >= k) j--;
            if(i < j){
                arr[i] = arr[j];
                i++;
            }
            while (i < j && arr[i] < k) i++;
            if(i < j){
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = k;

        fastSort(arr,left,i-1);
        fastSort(arr,i+1,right);
    }

    void quick_sort(int s[], int l, int r) {
        if (l < r)
        {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j)
            {
                while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if(i < j)
                    s[i++] = s[j];

                while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if(i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
    }
    public static void main(String[] args) {
        FastSort s = new FastSort();
        int[] arr = {2,6,1,2,0,5,3,4};
        s.fastSort(arr,0,arr.length-1);
        System.out.println(JSONObject.toJSONString(arr));
    }
}
