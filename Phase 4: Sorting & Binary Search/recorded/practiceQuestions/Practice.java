import java.util.Arrays;

public class Practice {
    public static int search(int[] nums, int t, boolean isFirst) {
        int n = nums.length;
        int s = 0, e = n-1;
        int ans = -1;
        while (s < e ){
            int m  = s+(e-s)/2;
            if (nums[m] != t){
                if (nums[m] < t){
                    s = m+1;
                }else{
                    e = m-1;
                }
            }else {
                if (isFirst){
                    return m-1;
                }else {
                    return m;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {1,1,2,3,4,5,6,7};
        int t = 1;
        int[] result = {-1,-1};
        result[0] = search(nums,t, true);
        result[1] = search(nums,t, false);
        System.out.print(Arrays.toString(result));
    }
}
