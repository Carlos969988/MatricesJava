import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int n = 5; // Change the value of n as needed
//
//        if (n <= 0) {
//            System.out.println("ERROR: Size must be greater than zero.");
//            System.exit(1); // Exit the program with an error code
//        }
//
//        // Create a matrix of size n x n
//        char[][] matrix = new char[n][n];
//
//        // Fill the matrix with underscores
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = '_';
//            }
//        }
//
//        // Place the "X" character on the diagonals of the matrix
//        for (int i = 0; i < n; i++) {
//            matrix[i][i] = 'X'; // Top-left to bottom-right diagonal
//            matrix[i][n - 1 - i] = 'X'; // Top-right to bottom-left diagonal
//        }
//
//        // Print the matrix
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j]);
//            }
//            System.out.println(); // New line after each row
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the size of the matrix (n x n): ");
//        int n = scanner.nextInt();
//
//        if (n == 0) {
//            System.out.println("ERROR");
//            System.exit(1);
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//
//                if (i == j || (j == n - i - 1)) {
//                    System.out.print("X");
//                } else {
//                    System.out.print("_");
//                }
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the chair (n x n): ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("ERROR");
            System.exit(1);
        }

        int[][] matrix = new int[n][n];

        // Fill the matrix with zeros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }

        // Fill the chair pattern in the matrix
        for (int i = 0; i < n; i++) {
            matrix[i][0] = 1;
            matrix[i][n - 1] = 1;
            if (i == n / 2) {
                for (int j = 1; j < n - 1; j++) {
                    matrix[i][j] = 1;
                }
            }
        }

        // Print the chair pattern matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}