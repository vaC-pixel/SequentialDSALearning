import java.util.Arrays;
public class LCQ_33_BinarySearch {

    //# Intuition
    // When an array is sorted and left-rotated, it appears broken,
    // causing standard binary search to fail because values do not
    // strictly increase from left to right. However, if we split the
    // array in half at any midpoint, exactly one of the two halves is
    // always normally sorted. We can leverage this invariant to guide
    // our search.

    //# Approach
    //1. Find the midpoint of the current search window using `mid = st + (end - st) / 2`
    // to prevent integer overflow.
    //2. Check if `arr[mid] == target`. If yes, return `mid` immediately.
    //3. Determine which half of the array is normally sorted:
    //   - **Left Half Sorted:** If `arr[st] <= arr[mid]`, check if the target falls within
    //   this left boundary (`arr[st] <= target && target < arr[mid]`). If it does, narrow
    //   our search window to the left (`end = mid - 1`); otherwise, search the right (`st = mid + 1`).
    //   - **Right Half Sorted:** If the left half is not sorted, the right half is guaranteed to be sorted.
    //   Check if the target falls within this right boundary (`arr[mid] < target && target <= arr[end]`).
    //   If it does, narrow our search window to the right (`st = mid + 1`); otherwise,
    //   search the left (`end = mid - 1`).
    //4. Repeat until pointers cross (`st > end`). If the target is not found, return `-1`.

    //# Complexity
    //- **Time Complexity:** $O(\log N)$ because the search space is cut in half with every single iteration.
    //- **Space Complexity:** $O(1)$ as only a few constant pointers (`st`, `end`, `mid`) are maintained.
    //

    public static int search(int[] arr, int target) {
        int n = arr.length;
        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // Identify which half is sorted
            if (arr[st] <= arr[mid]) { // Left sorted array
                // Does the target live in this sorted left range?
                if (arr[st] <= target && target < arr[mid]) {
                    end = mid - 1; // Yes, narrow left
                } else {
                    st = mid + 1; // No, narrow right
                }
            } else { // Right sorted array
                // Does the target live in this sorted right range?
                if (arr[mid] < target && target <= arr[end]) {
                    st = mid + 1; // Yes, narrow right
                } else {
                    end = mid - 1; // No, narrow left
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int [] arr= {4, 5, 6, 7, 0, 1, 2};
        System.out.println(Arrays.toString(arr));
        int target = 9;
        System.out.println("index : "+search(arr, target));
    }
}
