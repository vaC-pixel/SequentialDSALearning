import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    //Binary search
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int n =arr.length;
        if (arr == null||n <2) {
            System.out.println("Array is too small");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the index "+i+" value : ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the target element you wanna search : ");
        int t = sc.nextInt();

        int s =0, e = n-1, ans =-1;
        while (s <= e){
            int m = (s + e)/2;
            if (arr[m] == t){
                ans = m;
                break;
            } else if (arr[m] < t)
                s = m +1;
            else
                e = m-1;
        }
        if (ans != -1)
            System.out.println(("your answer is found at " + ans));
        else
            System.out.println((ans + " your answer is not found"));
    }
}
