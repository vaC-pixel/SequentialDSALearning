import java.util.Arrays;
import java.util.Scanner;

public class ValidPalindrome {
    //Intuition :
    //We will have to check whether an array of string is palindrome or not?

    // # Approach :
    // We will use two pointers approach to check an array from both sides.
    // If the array start element is same to the end element of the array.
    // We will increase the start by one index and decrease end by one index.
    // If all the elements are same across both sides of the array.Then, it
    // will be palindrome otherwise not palindrome.

    //# Code :
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        //Taking input from user for the size of the array
        int size = sc.nextInt();
        char[] chars = new char[size];
        int n = chars.length;//length of the array


        //Taking input from user the arrays values
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the index "+i+" character : ");
            chars[i] = sc.next().charAt(0);
        }
        System.out.println(Arrays.toString(chars));

        int st = 0, end = n-1;//these are the two pointers

        //Initially assume that the array is palindrome
        boolean isPalindrome = true;
        //While loop will run until the left side pointer is smaller
        //than the right side pointer
        while(st < end){
            //Breaking the loop at the very first non-match element
            //to prevent from checking the whole array
             if (chars[st] != chars[end]){
                isPalindrome = false;
                break;
            }
            st++;
            end--;
        }
        System.out.println(isPalindrome?"Array is Palindrome"
                :
                "Array is not Palindrome");
    }
}
