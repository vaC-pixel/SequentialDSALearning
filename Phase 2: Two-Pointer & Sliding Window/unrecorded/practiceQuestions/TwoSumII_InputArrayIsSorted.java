public class TwoSumII_InputArrayIsSorted {
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
