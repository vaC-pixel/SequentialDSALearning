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

        // Step 2: The Outer Loop (The Fixed Anchor)
        for (int i = 0; i < n - 2; i++) {

            // Duplicate-Skipping Guard for Anchor:
            // If our anchor is the same as the previous one, skip it to avoid duplicate triplets!
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            // Step 3: Inner Two-Pointer Scan (Two Sum II pattern)
            int l = i + 1;      // Starts right after the anchor
            int r = n - 1;      // Starts at the extreme right end

            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];

                if (sum == 0) {
                    // We found a valid triplet! Add it to our results
                    result.add(Arrays.asList(arr[i], arr[l], arr[r]));

                    // Duplicate-Skipping Guards for inner pointers:
                    while (l < r && arr[l] == arr[l + 1]) l++; // Skip duplicate lefts
                    while (l < r && arr[r] == arr[r - 1]) r--; // Skip duplicate rights

                    // Move both pointers inward after finding a match
                    l++;
                    r--;
                }
                else if (sum < 0) {
                    // Sum is too small, we need a bigger number -> move left pointer right
                    l++;
                }
                else {
                    // Sum is too big, we need a smaller number -> move right pointer left
                    r--;
                }
            }
        }

        // Print final unique triplets
        System.out.println("Unique Triplets: " + result);
    }
}