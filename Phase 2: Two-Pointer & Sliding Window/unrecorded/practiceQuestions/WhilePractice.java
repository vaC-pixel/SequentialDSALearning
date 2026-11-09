import java.util.Arrays;
import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] args){
        int[] arr = {23,40,5,3,2,81,18,99};
        int n = arr.length;
        int l = 0, r = n-1;
        int maxArea = 0;
            while (l< r){
                int h = Math.min(arr[l],arr[r]);
                int w = r-l;
                int currentArea = h * w;
                maxArea= Math.max(maxArea,currentArea);
                if (arr[l]< arr[r]) {
                    l++;
                } else{
                    r--;
                }
            }
        System.out.println(" Maximum area is : "+maxArea);
    }
}
