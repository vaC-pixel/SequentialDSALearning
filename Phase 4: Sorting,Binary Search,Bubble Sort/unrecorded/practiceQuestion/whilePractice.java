import java.util.Arrays;

public class whilePractice {
    public static void swap(int i , int j , int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static  void main (String[] args){
        //insertion sort
        int[] arr = new int[]{7,6,5,4,3,2,1};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] > key){
                arr[prev+1] =arr[prev];
                prev--;
            }
            arr[prev+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
