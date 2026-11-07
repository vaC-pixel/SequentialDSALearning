import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementAnsMoveZerosToEnd {
    //Remove Element and Move Zeros to End
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n];

        //Checking for valid array size
        if (arr == null || n < 2){
            System.out.print("Array is too small for performing operation");
            return;
        }
        //Taking array's values as input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the index "+i+" value : ");
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0){
                ans[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
