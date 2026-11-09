public class TwoSumII_InputArrayIsSorted {
    //Two Sum II - Input Array Is Sorted (Medium-Easy)
    //The Goal: Given a sorted array of integers, find the
    //indices of two numbers that add up to a specific target sum.
    //
    //The Two-Pointer Mechanics: Put left at index 0 and right
    //at index n - 1. If the sum is too small, move left++ to increase
    //the sum. If the sum is too large, move right-- to decrease it.
    //Because it's sorted, you eliminate half the search space instantly.
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int t =8,n = arr.length,l  = 0, r = n-1;
        while (l < r){
            if (arr[l] + arr[r] > t){
                r--;
            } else if (arr[l] + arr[r] < t){
                l++;
            } else {
                System.out.println(l+" , "+r+" : is the indices of targeted sum");
                r--;
                l++;
            }
        }
    }
}
