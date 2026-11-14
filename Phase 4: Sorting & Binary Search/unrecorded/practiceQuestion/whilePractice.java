import java.util.Arrays;

public class whilePractice {
    public static int search(int[] nums, int t, boolean isFirst) {
        int ans = -1;
        int n = nums.length;
        int s = 0, e = n-1;
        while (s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==t){
                ans = m;
                if (isFirst){
                    s = m+1;
                }else {
                    e = m-1;
                }
            } else if (nums[m] < t) {
                s = m+1;
            }else {
                e = m-1;
            }
        }
        return(ans);
    }
    public static  void main (String[] args){
        int[] arr = {1,2,3,5,5,6,7};
        int t = 3;
        int[] ans = {-1,-1};
        ans[0] = search(arr, t,true);
        ans[1] = search(arr, t,false);
        System.out.println(Arrays.toString(ans));
    }
}
