import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WhilePractice {
    //Questions :
    //1. Why we have used for loop for n-2?

    //2. what does it mean by : if (i > 0 && arr[i] == arr[i-1]){
    //                continue;
    //            } why we have used it?

    //3. why we initialize the left with i + 1. How it will work
    //in the code?

    //4. what does it mean by these two lines of code :
    //while (left < right && arr[left] == arr[left +1]) left++;
    //while (left < right && arr[right] == arr[right -1]) right--;
    //and why we use while loop. What are the conditions that are handle
    //by the while loop?

    //5. After the above lines while loop increase the left and decrease the right.
    //then why we have use left++ and right-- after that?

    //6. Let me know that how and where has been changing its state in the code
    // and also elaborate its purpose.

    public static void main(String[] args){
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
