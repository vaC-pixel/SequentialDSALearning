import java.util.Arrays;
import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        //Taking input from user for the size of the array
        int size = sc.nextInt();
        char[] chars = new char[size];
        int n = chars.length;//length of the array

        //Initially assume that the array is palindrome
        boolean isPalindrome = true;
        //Taking input from user the arrays values
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the index "+i+" character : ");
            chars[i] = sc.next().charAt(0);
        }

        System.out.println(Arrays.toString(chars));
        int st = 0, end = n-1;

        //While loop will run until the left side pointer is smaller
        //than the right side pointer
        while(st < end){
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
