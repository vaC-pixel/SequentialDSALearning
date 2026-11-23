public class LCQ_1572_2DArray {
    static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i+j == n-1 || i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
