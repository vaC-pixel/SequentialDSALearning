import java.util.Arrays;

public class whilePractice {
    public static void swap(int i , int j , int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static  void main (String[] args){
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        boolean isSort = false;
        for (int i = n-1; i >= 0 ; i--) {
            int max = i;
            for (int j = i-1; j >=0; j--) {
                if (arr[j] < arr[max]){
                    max = j;
                }
                swap(i, j , arr);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
