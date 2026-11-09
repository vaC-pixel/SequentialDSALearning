import java.util.Arrays;

public class ContainerWithMostWater {
    //Container With Most Water (Medium)
    //The Goal: Given an array of heights representing vertical lines,
    //find two lines that together with the x-axis form a container that
    // holds the most water.
    //
    //The Two-Pointer Mechanics:
    // Start with pointers at both ends (0 and n - 1). Calculate the area,
    // then greedily move the pointer pointing to the shorter line inward,
    // hoping to find a taller line.
    public static  void main(String[] args){
    int[] arr = {23,40,5,3,2,81,18,99};
    int n = arr.length;
    int[] area = new int[n];
    int maxIndx = 0, max = Integer.MIN_VALUE, secMaxIndx = 0, secMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max){
                secMax = max;
                max = arr[i];
                maxIndx = i;
                System.out.println(arr[i]+" ,"+maxIndx);
            }

            if (secMax > arr[i]){
                secMax = arr[i];
                secMaxIndx = i;
            //System.out.println(arr[i] + " ," + secMaxIndx);
            }
            area[i] = arr[i] * i;
            System.out.println(arr[i]+" ,"+i);
        }
        int newMax = 0;
        int st = 0, end = n-1;

            while(st < end){
                if (area[end] > newMax ) {
                    newMax = area[end];
                }
                else {
                    newMax = area[st];
                }
                st++;
                end--;
            }
        System.out.println(Arrays.toString(area)+", "+newMax);
    }
}
