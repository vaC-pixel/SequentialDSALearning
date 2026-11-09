import java.util.Arrays;
import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] args){
        int[] arr = {0,1,3,2,8,9,1,3};
        int n = arr.length;
        int l = 0, r = n-1;
        int lmx = 0, rmx= 0, water = 0;

        while(l < r){
            if (arr[l] < arr[r]){
                if (arr[l] >= lmx){
                    lmx = arr[l];
                } else {
                    water += lmx - arr[l];
                }
                l++;
            }else {
                if (arr[r] > rmx){
                    rmx = arr[r];
                } else {
                    water += rmx - arr[r];
                }
                r--;
            }
        }
        System.out.println(water);
    }
}
