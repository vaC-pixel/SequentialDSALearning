import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Sum3Hard {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(arr); // Step 1: Sort the array -> [-4, -1, -1, 0, 1, 2]
        System.out.println("Sorted: " + Arrays.toString(arr));
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n-2; i++) {
            if (i > 0 && arr[i] == arr[i-1]){
                continue;
            }
            int l = i+1;
            int r = n-1;
            while (l < r){
                int sum = arr[i] + arr[l] + arr[r];
                if (sum == 0){
                    result.add(Arrays.asList(arr[i], arr[l], arr[r]));
                    while (l<r && arr[l] == arr[l+1])l++;
                    while (l<r && arr[r] == arr[r-1])r--;
                    l++;
                    r--;
                }else if(sum < 0) {
                    l++;
                }else {
                    r--;
                }
            }
        }
        System.out.println(result);
    }
}