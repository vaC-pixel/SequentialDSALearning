public class LCQ_875_BinarySearch {
    //875. Koko Eating Bananas
    //Koko loves to eat bananas. There are n piles of bananas, the ith pile has
    // piles[i] bananas.The guards have gone and will come back in h hours.
    //
    //Koko can decide her bananas-per-hour eating speed of k. Each hour, she
    // chooses some pile of bananas and eats k bananas from that pile. If the
    // pile has less than k bananas, she eats all of them instead and will not
    // eat any more bananas during this hour.
    //
    //Koko likes to eat slowly but still wants to finish eating all the
    // bananas before the guards return.
    //
    //Return the minimum integer k such that she can eat all the
    // bananas within h hours.

    //steps to break it down :
    //1. Find the maximum value in the array;
    //2. Make two pointers start and end;
    //3. Also make a variable for storing answer;
    //4. Start while loop till start smaller equal to end;
    //5. Then, find the mid in that while loop;
    //6. Initialize totalHours with 0;
    //7. For getting the minimum speed.Make an enhance for loop.
    //8. Inside that loop, updating totalHours by applying formula of getting
    //ceiling value:{Ceiling}(array[pile] / mid) =(array[pile] + mid - 1)/mid;
    //9. Check the totalHours is <= providing hours or not.If yes, then store the
    //mid to the answer and narrowing the array to the left.
    //10. If not, then narrowing the array to the right side.
    //11. In the last return the answer
    public static int search(int[] arr, int hr){
        int maxPile = 0;
        for (int pile : arr) {
            maxPile = Math.max(maxPile, pile);
        }

        // Replace: for (int k = 1; k <= maxPile; k++)
        // With Binary Search on the answer range [1 ... maxPile]:
        int s = 1;
        int e = maxPile;
        int ans = maxPile;

        while (s <= e) {
            int mid = s + (e - s) / 2; // 'mid' takes the place of 'k'
            long totalHours = 0;

            for (int pile : arr) {
                totalHours += (pile + mid - 1) / mid;   
            }
            if (totalHours <= hr) {
                ans = mid;     // Speed 'mid' works! Record it as our best answer so far
                e = mid - 1;   // Try to find an even slower valid speed on the left
            } else {
                s = mid + 1;   // Too slow! We exceeded 'hr', so search faster speeds on the right
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = new int[]{3, 6, 7, 11};
        int h = 8;
        System.out.println("these are the minimum hour for koko to eat banana: "+search(arr, h));
    }
}
