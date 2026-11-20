import java.util.Arrays;

public class SelectionAlgorithm {
    public  static void swap(int[] arr, int i , int min){
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
    public void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        boolean isSwap = false;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n ; j++) {
                int min = i;
                if (arr[j] < arr[min]){
                    min = j;
                    isSwap = true;
                }
                if (!isSwap){
                    System.out.println("breaking out");
                    break;
                }
                if (min != i) {
                    swap(arr,i,min);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
