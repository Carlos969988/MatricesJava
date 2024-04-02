public class ExampleMatricesStringFor2 {
    public static void main(String[] args) {

        String[][] names = {{"juan", "carlos"},{"ana", "sara"},{"jose", "denise"}};

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
