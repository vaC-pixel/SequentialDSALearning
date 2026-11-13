import java.util.Arrays;

public class LCQ_34_BinarySearch {
    //34. Find First and Last Position of Element in Sorted Array
    //Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
    //
    //If target is not found in the array, return [-1, -1].
    //
    //You must write an algorithm with O(log n) runtime complexity.
    //Example 1:
    //
    //Input: nums = [5,7,7,8,8,10], target = 8
    //Output: [3,4];

    private static int found(int[] arr, int t , boolean isFirst){
        int bound = -1;
        int n = arr.length;
        int s = 0, e = n-1;
        while (s<=e){
            int m = s+(e-s)/2;
            if (arr[m] ==t){
                bound =m;
                if (isFirst){
                    e = m-1;
                }else {
                    s = m+1;
                }
            } else if (arr[m] < t) {
                s = m+1;
            }else {
                e = m-1;
            }
        }
        return bound;
    }
    public static void  main (String[] args){
        int[] arr  = {5,7,7,8,8,10};
        int[] ans = {-1,-1};
        int t = 8;
        ans[0] = found(arr, t , true);
        ans[1] = found(arr, t , false);
        System.out.println(Arrays.toString(ans));
    }
}
