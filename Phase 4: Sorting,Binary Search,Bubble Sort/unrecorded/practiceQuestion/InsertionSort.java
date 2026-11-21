import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args){
        int[] arr = new int[]{7,6,5,4,3,2,1};
        int n = arr.length;
        //The Core Intuition
        //Imagine you are sorting a hand of playing cards. You pick up one card at a
        // time from the table and insert it into the correct position in your hand,
        // shifting other cards to the right as needed.

        //1. We will start loop from index number 1. Bcz , we supposed the index 0 as the sorted element
        //and the rest as unsorted.Then, We will store the array of i + 1 as key and previous array of
        //i - 1.
        //
        //2. we will set a loop in which we are running loop until the prev is greater or equal
        //to zero and the value at previous index will be greater than key.If the previous hit -1 index and
        // the value at index of previous is greater than the key.
        //
        //3. We will set the value at previous + 1 to the value at array of previous.Then, we will decrease
        // the index prev by 1.loop will be terminated when it will get the index - 1 after decrement.
        //
        //4. After that will have the array which has shifted the value of previous.
        //
        //5. But,at the same time, we have lost the value that was placed just after the previous.As we have
        // stored that value in the key.We will insert that value to previous + 1;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] > key){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}