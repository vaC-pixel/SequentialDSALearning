import java.util.Arrays;
import java.util.Scanner;

public class RvrseArrInPlace {
    //Reverse an array using two pointer approach
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int[] arr =new int[size];
        int n = arr.length;

        //Checking for array validation
        if (arr == null || n == 0 || n == 1){
            System.out.println("Array is too small");
            return;
        }
        //Taking array value in input from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the index "+i+" value : ");
            arr[i] = sc.nextInt();
        }

        //Here we are swapping the arrays left index values with
        //corresponding right index values
        int st = 0, end = n-1;
        while (st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
