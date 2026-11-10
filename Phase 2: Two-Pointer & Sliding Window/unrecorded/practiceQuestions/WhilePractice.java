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
        int[] arr = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n-2; i++) {
            if (i > 0 && arr[i] == arr[i-1]){
                continue;
            }
            int left = i+1;
            int right = n-1;
            while (left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0){
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    while (left < right && arr[left] == arr[left +1]) left++;
                    while (left < right && arr[right] == arr[right -1]) right--;
                    left++;
                    right--;
                }else if (sum < 0){
                    left++;
                }else {
                    right--;
                }
            }
        }
        System.out.println(result);


    }
}
