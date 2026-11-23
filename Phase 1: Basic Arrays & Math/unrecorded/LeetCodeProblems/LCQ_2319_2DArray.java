public class LCQ_2319_2DArray {
    public  static boolean grid(int arr[][]) {
        boolean ans = false;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i+j == n-1 && i +1 == 0 || j+1 == 0){
                    ans = true;
                }
            }
        }
        return ans;
    }
    static void main(String[] args) {
        int[][] arr = new int[][]{{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}};
        System.out.println(grid(arr));
    }
}
