import java.util.Arrays;

public class whilePractice {
    public static int search(int[] nums, int t) {
        int ans = -1;
        int n =nums.length;
        int s = 0, e = n-1;
        while (s<=e){
            int m = s+(e-s)/2;
                if(nums[m] == t){
                    return m;
                }
                if (nums[s] <= nums[m]){
                    if (nums[s] <= t && t < nums[m]){
                        e = m-1;
                    }else {
                        s = m+1;
                    }
                }else {
                    if (nums[e] > t && t <= nums[m]){
                        s = m+1;
                    }else{
                        e = m-1;
                    }
                }
        }
        return(ans);
    }
    public static  void main (String[] args){
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int t = 0;
        System.out.println(search(nums, t));
    }
}
