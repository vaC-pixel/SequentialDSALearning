public class DiagonalSumRightToLeft {
    static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        int sum = 0;
        for (int i = n-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (i + j == n-1){
                    System.out.println(arr[i][j]+" : "+sum+" idx : "+i+" : "+j);
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
