import java.util.Arrays;
import java.util.Scanner;

public class SortColorsOrDutchNationalFlag {


    //5. Sort Colors / Dutch National Flag (Medium)The Goal:
    // Given an array containing only 0s, 1s, and 2s, sort them
    // in-place in a single pass ($O(N)$ time).The Two-Pointer

    // Mechanics:
    // This actually uses three pointers (low, mid, high) to partition
    // the array into three distinct sections on the fly.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int n = arr.length;

        if (arr == null|| n <2) {
            System.out.println("Array is too small");
            return;
        }
        //Here we are taking arrays values
        System.out.println("The values should be 0s, 1s and 2s");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the index "+i+" value : ");
            arr[i] = sc.nextInt();
        }

        int low = 0;//Left guard
        int mid = 0;//Element Inspector
        int high = n-1;//Right guard

        //Here will be logic will be written
        while (mid <= high){
            if (arr[mid] == 0){
                int temp = arr[low];
                arr[low++] = arr[mid];
                arr[mid++] = temp;
            } else if (arr[mid] == 1) {
                mid++;
            }else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
