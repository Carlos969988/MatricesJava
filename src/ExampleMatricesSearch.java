public class ExampleMatricesSearch {
    public static void main(String[] args) {

        int[][] integerMatrix = {
                {35, 90, 3, 2978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}};

        int elementSearch = 1999;
        boolean find = false;
        int i;
        int j = 0;
        buscar: for (i = 0; i < integerMatrix.length; i++) {
            for (j = 0; j < integerMatrix[i].length; j++) {
                if (integerMatrix[i][j] == elementSearch) {
                    find = true;
                    break buscar;
                }
            }
        }

        if (find) {
            System.out.println("found " + elementSearch + " in the coordinates " + i + "," + j);
        } else {
            System.out.println(elementSearch + " not found in the matrix!");
        }
    }
}
