import java.util.Arrays;
import java.util.Scanner;

public class RvrseArrInPlace {
    //Intuition :
    //Reverse an array in place without using another.

    //# Approach :
    //We will use two pointers which will stand both ends of the array.
    //We will swap last index element (end) to the first index element(st).Then,
    //Increase the st by one and decrease end by one.
    //Then,we will swap the st+1 to end-1 and so on.
    //We will run loop until st is smaller than end.

    //# Code :
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
