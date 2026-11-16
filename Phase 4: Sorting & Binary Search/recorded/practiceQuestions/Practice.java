public class Practice {
    public static int findMin(int[] nums) {
        int n = nums.length;
        int st = 0, end = n-1, min = 0;
        while(st < end){
            min = Math.min(nums[st] , nums[end]);
            st++;
            end--;
        }
        return min;
    }
    public static void main(String[] args){
        int[] nums = {3, 4, 5, 1, 2};
        int n = nums.length;
        System.out.println(findMin(nums));
    }
}
