import java.util.Arrays;
import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        if (arr == null || n <2) {
            System.out.println("Array is too small");
            return;
        }

        //Taking array's value as input using for loop
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the index "+i+" value : ");
            arr[i] = sc.nextInt();
        }
        //initializing the two left and right pointers
        int l = 0, r = n - 1;

        //Storing the area the which containing most water
        int maxArea = 0;

        //Here we are writing the logic for checking which
        //elements of array giving the desire result
        while (l < r) {
            // 1. Calculate height (limited by the shorter line)
            int height = Math.min(arr[l], arr[r]);

            // 2. Calculate width
            int width = r - l;

            // 3. Compute current area and update maxArea
            int currentArea = height * width;
            maxArea = Math.max(maxArea, currentArea);
            System.out.println("max area : "+maxArea);

            // 4. Greedily move the pointer with the smaller height inward
            if (arr[l] < arr[r]) {
                System.out.println("The inward smaller height : "+l);
                l++;
            } else {
                r--;
            }
        }
        System.out.println("Maximum Water Area: " + maxArea+" wich is come from index value :"+arr[l]+" and "+arr[r]);
    }
}
