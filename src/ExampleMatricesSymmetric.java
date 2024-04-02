public class ExampleMatricesSymmetric {
    public static void main(String[] args) {

        boolean symmetric = true;
        int[][] matrix = {          // when their transpose is equal
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

//        int i, j;
//        i = 0;
//        while (i < matrix.length /*&& symmetric == true*/) {
//            j = 0;
//           out: while (j < i /*&& symmetric == true*/) {
//                if (matrix[i][j] != matrix[j][i]) {
//                    symmetric = false;
//                    break out;
//                }
//                j++;
//            }
//            i++;
//        }

        for (int i = 0; i < matrix.length; i++) {
            out: for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break out;
                }
            }
        }

        if (symmetric) {
            System.out.println("Matrix is symmetric");
        } else {
            System.out.println("Matrix is not symmetric");
        }
    }
}
