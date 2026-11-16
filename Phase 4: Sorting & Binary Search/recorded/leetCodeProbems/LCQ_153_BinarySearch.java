public class LCQ_153_BinarySearch {

    //153. Find Minimum in Rotated Sorted Array
    //Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example,
    // the array nums = [0,1,2,4,5,6,7] might become:
    //
    //[4,5,6,7,0,1,2] if it was rotated 4 times.
    //[0,1,2,4,5,6,7] if it was rotated 7 times.
    //Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array
    // [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
    //
    //Given the sorted rotated array nums of unique elements, return the minimum element of this array.
    //
    //You must write an algorithm that runs in O(log n) time.
    public static void main(String[] args){
        int[] nums = new int[]{3, 4, 5, 0, 2};
        int n = nums.length;
        int min = 0;
        int s = 0, e = n-1;
        while (s < e){
            int mid = s+(e-s)/2;
            if (nums[mid] > nums[e]){
                min = Math.min(nums[mid],nums[e]);
                s = mid+1;
            }else {
                min = Math.min(nums[s],nums[mid]);
                e = mid-1;
            }
        }
        System.out.println(min);


    }
}
