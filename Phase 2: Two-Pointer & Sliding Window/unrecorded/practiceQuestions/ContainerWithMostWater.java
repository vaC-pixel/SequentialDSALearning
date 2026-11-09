import java.util.Arrays;
import java.util.Scanner;

public class ContainerWithMostWater {
    //Container With Most Water (Medium)
    //The Goal: Given an array of heights representing vertical lines,
    //find two lines that together with the x-axis form a container that
    // holds the most water.

    //The Two-Pointer Mechanics:
    // Start with pointers at both ends (0 and n - 1). Calculate the area,
    // then greedily move the pointer pointing to the shorter line inward,
    // hoping to find a taller line.
    public static  void main(String[] args){
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
        int l = 0, r = n - 1, bestL = 0, bestR = 0;

        //Storing the area the which containing most water
        int maxArea = 0;

        while (l < r){
            //Calculating height
            int h= Math.min(arr[l], arr[r]);
            //Calculating width
            int w = r-l;
            //Calculating the area
            int currentArea = h * w;
            if (currentArea > maxArea){
                //Updating max area with current area
                maxArea = currentArea;

                //These are indices which are the lines
                //containing the most water
                bestL = l;
                bestR = r;
            }

            //this line will march the entire array
            if (arr[l] < arr[r])
                l++;
            else
                r--;
        }
        System.out.println(maxArea+", "+bestL+", "+bestR);
    }
}
