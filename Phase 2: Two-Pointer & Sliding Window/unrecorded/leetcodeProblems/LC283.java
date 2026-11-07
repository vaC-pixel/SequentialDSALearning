import java.util.Arrays;

public class LC283 {
    public static void main(String[] args){
    // Given an integer array nums, move all 0's to the end of it
    // while maintaining the relative order of the non-zero elements.
    //Note that you must do this in-place without making a copy of the array.

    //Example 1:
    //Input: nums = [0,1,0,3,12]
    //Output: [1,3,12,0,0]

    //Example 2:
    //Input: nums = [0]
    //Output: [0]

        int[] nums = {0,1,0,3,12};
        int n = nums.length;
        int[] ans = new int[n];
        int st = 0, end = n-1;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0)
                ans[st++] = nums[i];
            else
                ans[end--] = nums[i];
        }
        //Copying
        for (int i = 0; i < n; i++) {
            nums[i] = ans[i];
        }
//        System.out.println(Arrays.toString(nums)); //[1, 3, 12, 0, 0]
    }
}
