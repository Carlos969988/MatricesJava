public class ExampleMatricesSum {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] b = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}};

        int[][] sum = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println( );
        }
    }
}
