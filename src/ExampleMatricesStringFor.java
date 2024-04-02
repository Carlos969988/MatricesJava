public class ExampleMatricesStringFor {
    public static void main(String[] args) {

        String[][] names = new String[3][2];

        names[0][0] = "juan";
        names[0][1] = "carlos";
        names[1][0] = "ana";
        names[1][1] = "sara";
        names[2][0] = "jose";
        names[2][1] = "denise";

        System.out.println("============== Iterating with for ===============");
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " \t");
            }
            System.out.println();
        }

        System.out.println("============== Iterating with foreach ===============");

        for (String[] row: names) {
            for (String name: row) {
                System.out.print(name + " \t");
            }
            System.out.println();
        }
    }
}
