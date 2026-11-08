import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementAndMoveZerosToEnd {
    //Remove Element and Move Zeros to End
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

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

        //taking input the target value
        System.out.print("Enter the target value : ");
        int t = sc.nextInt();
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] !=t ){
                arr[idx++] = arr[i];
            }
        }

        //Here we are printing the vlaues except the target value
        System.out.print("Modified array : [");
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + (i < idx-1 ? ", ":""));
        }
        System.out.println("]");
        System.out.println("New length of array : "+idx);
    }
}
