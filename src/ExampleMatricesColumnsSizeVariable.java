public class ExampleMatricesColumnsSizeVariable {
    public static void main(String[] args) {

        int[][] matrix = new int[3][];

        matrix[0] = new int[2];
        matrix[1] = new int[3];
        matrix[2] = new int[4];

        System.out.println("length matrix: " + matrix.length);
        System.out.println("length 0 row: " + matrix[0].length);
        System.out.println("length 1 row: " + matrix[1].length);
        System.out.println("length 2 row: " + matrix[2].length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * j;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
