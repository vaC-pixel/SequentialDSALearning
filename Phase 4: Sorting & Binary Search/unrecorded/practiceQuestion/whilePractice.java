public class whilePractice {
    public static int search(int[] nums, int t) {
        int n = nums.length;
        int s = 0, e = n-1, ans = -1;
        while(s <= e){
            int m = (e + s)/2;
            if(nums[m] == t){
                ans = m;
                break;
            }else if(nums[m] < t){
                s = m +1;
            }else{
                e = m-1;
            }
        }
        return(ans);
    }
    public static  void main (String[] args){
    int[] arr = {1,2,3,5,6,7};
    int target = 3;
        System.out.println(search(arr, target));
    }
}
