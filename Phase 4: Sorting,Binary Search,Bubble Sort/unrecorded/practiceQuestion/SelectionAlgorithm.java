import java.util.Arrays;

public class SelectionAlgorithm {
    public  static void swap(int i , int j){
        int temp = i;
        i = j;
        j = temp;
    }
    public void main(String[] args){
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
                swap(arr[i], arr[j]);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
