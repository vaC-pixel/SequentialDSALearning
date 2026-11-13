public class LCQ_704_BinarySearch {
    //Given an array of integers nums which is sorted in ascending order,
    // and an integer target, write a function to search target in nums.
    // If target exists, then return its index. Otherwise, return -1.

    //You must write an algorithm with O(log n) runtime complexity.

    public  static int search(int[] nums, int target){
        int n = nums.length;
        int ans = -1,st = 0,end = n-1;
        while (st<=end){
            int mid = (st +end)/2;
            if (nums[mid] == target){
                ans = mid;
                break;
            } else if (nums[mid]<target) {
                st = mid+1;
            }else {
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int target = 3;
        System.out.println(search(nums, target));

    }
}
