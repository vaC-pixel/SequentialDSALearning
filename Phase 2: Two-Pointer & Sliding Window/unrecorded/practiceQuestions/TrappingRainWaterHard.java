import java.util.Arrays;
import java.util.Scanner;

public class TrappingRainWaterHard {
    public static void main(String[] args) {
        // ====================================================================
        // 1. ARCHITECTURAL INITIALIZATION & SYSTEM REGISTERS
        // ====================================================================
        // Representing our physical elevation map (brick walls of varying heights)
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int n = arr.length;
        if (arr == null || n < 2) {
            System.out.println("Array is too small");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Index : ");
            arr[i]= sc.nextInt();
        }
        // Pointer 'l': The left scout starting at the absolute beginning (index 0)
        int l = 0;

        // Pointer 'r': The right scout starting at the absolute end (index n - 1)
        int r = n - 1;

        // Register 'leftMax': Records the tallest wall encountered so far from the left
        int leftMax = 0;

        // Register 'rightMax': Records the tallest wall encountered so far from the right
        int rightMax = 0;

        // Accumulator 'water': Tracks total volume of trapped water drop-by-drop
        int water = 0;

        System.out.println("=== INITIALIZING ELEVATION MAP SIMULATION ===");
        printElevationMap(arr);

        // ====================================================================
        // 2. THE OPPOSITE-DIRECTION 2-POINTER SCAN LOOP ($O(N)$ Time)
        // ====================================================================
        // We run until the left and right pointers meet in the middle.
        // Why? Because water at any index is limited by the SHORTER outer boundary.
        // By evaluating the smaller outer wall first, we eliminate the need for
        // nested loops ($O(N^2)$), resolving water accumulation in a single linear pass.
        while (l < r) {
            // Compare outer boundary heights to determine the controlling bottleneck side
            if (arr[l] < arr[r]) {
                // --------------------------------------------------------
                // LEFT SIDE IS SHORTER:
                // This guarantees that whatever wall exists further right (arr[r])
                // is tall enough to seal this left basin. Thus, leftMax governs!
                // --------------------------------------------------------

                if (arr[l] >= leftMax) {
                    // Case A: We found a new or equal highest wall on the left.
                    // No water can pool here because it's taller than or equal to previous max.
                    leftMax = arr[l];
                } else {
                    // Case B: Current bar is shorter than leftMax.
                    // Because arr[l] < arr[r] and arr[l] < leftMax, water is safely trapped!
                    // Volume trapped = (leftMax height) - (current bar height)
                    water += leftMax - arr[l];
                }
                // Advance the left pointer inward to inspect the next column
                l++;

            } else {
                // --------------------------------------------------------
                // RIGHT SIDE IS SHORTER (or equal):
                // This guarantees that the left boundary (arr[l]) is tall enough
                // to seal this right basin. Thus, rightMax governs!
                // --------------------------------------------------------

                if (arr[r] >= rightMax) {
                    // Case A: We found a new or equal highest wall on the right.
                    rightMax = arr[r];
                } else {
                    // Case B: Current bar is shorter than rightMax. Water is trapped!
                    // Volume trapped = (rightMax height) - (current bar height)
                    water += rightMax - arr[r];
                }
                // Pull the right pointer inward to inspect the next column
                r--;
            }
        }

        // ====================================================================
        // 3. FINAL SYSTEM OUTPUT
        // ====================================================================
        System.out.println("\n[SYSTEM RESULT] Total Trapped Water Volume: " + water + " units.");
    }

    // ====================================================================
    // CONSOLE VISUALIZER: Renders ASCII elevation map & water pools dynamically
    // ====================================================================
    public static void printElevationMap(int[] arr) {
        int maxHeight = 0;
        for (int h : arr) maxHeight = Math.max(maxHeight, h);

        System.out.println("\nElevation Map Visualization (█ = Wall, ~ = Trapped Water):");
        for (int row = maxHeight; row >= 1; row--) {
            System.out.print(String.format("%2d | ", row));
            for (int col = 0; col < arr.length; col++) {
                if (arr[col] >= row) {
                    System.out.print("█ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.print("   +--");
        for (int i = 0; i < arr.length; i++) System.out.print("--");
        System.out.println();
        System.out.print("     ");
        for (int i = 0; i < arr.length; i++) System.out.print(i + " ");
        System.out.println("\n");
    }
}