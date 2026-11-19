import java.util.Arrays;

public class ContateAnArray {
    public static  void main(String[] args){
        int[] arr = {18, 69, 83, 45 ,41};
        int n= arr.length;
        int[] newArr = new int[2*n];
        int newN = newArr.length;
        for (int i = 0; i < newN; i++) {
            newArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
