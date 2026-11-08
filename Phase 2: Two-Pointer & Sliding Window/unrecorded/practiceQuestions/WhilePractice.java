import java.util.Arrays;
import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        if (size < 2 ){
            System.out.println("Array is too small for operation");
            return;
        }
        int[] arr = new int[size];
        int n = arr.length;
        if (arr == null || n == 0){
            System.out.println("Enter the correct arrays values");
            return;
        }

        //taking array's values input from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the index "+i+" value : ");
            arr[i] = sc.nextInt();
        }

        //Here we asking for the targeted value;
        System.out.print("Enter the target value : ");
        int t = sc.nextInt();
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != t)
                arr[idx++] = arr[i];
        }
        System.out.print("Modified array: [");
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + (i < idx - 1 ? ", " : ""));
        }
        System.out.println("]");
        System.out.println("New length of array: " + idx);
    }
}
