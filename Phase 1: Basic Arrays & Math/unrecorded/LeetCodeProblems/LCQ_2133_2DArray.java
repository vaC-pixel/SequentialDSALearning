public class LCQ_2133_2DArray {
    static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {3, 1, 2}, {2, 3, 1}};
        int n = arr.length;
        int count = 0;
        boolean ans = false;
        for (int i = 0; i< n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
                count++;
            }
            if(count == arr[i].length){
                ans = true;
            }
        }
        System.out.println(ans);
    }
}
