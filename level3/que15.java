import java.util.Random;

public class que15 {

    public static void main(String[] args) {
        int size = 2; // Use 2x2 matrix for easy inverse
        int[][] matrix = generateRandomMatrix(size);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] transpose = getTranspose(matrix);
        System.out.println("\nTranspose:");
        printMatrix(transpose);

        int determinant = getDeterminant2x2(matrix);
        System.out.println("\nDeterminant: " + determinant);

        if (determinant != 0) {
            double[][] inverse = getInverse2x2(matrix, determinant);
            System.out.println("\nInverse:");
            printMatrix(inverse);
        } else {
            System.out.println("\nInverse does not exist (Determinant is 0).");
        }
    }

    // Generate a random square matrix of given size with values from 1 to 9
    public static int[][] generateRandomMatrix(int size) {
        int[][] matrix = new int[size][size];
        Random rand = new Random();
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrix[i][j] = rand.nextInt(9) + 1;
        return matrix;
    }

    // Transpose of a square matrix
    public static int[][] getTranspose(int[][] matrix) {
        int size = matrix.length;
        int[][] transpose = new int[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                transpose[j][i] = matrix[i][j];
        return transpose;
    }

    // Determinant of 2x2 matrix: |A| = ad - bc
    public static int getDeterminant2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Inverse of 2x2 matrix: (1/det) * [d -b; -c a]
    public static double[][] getInverse2x2(int[][] matrix, int det) {
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;
        return inverse;
    }

    // Print integer matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.printf("%6d", val);
            System.out.println();
        }
    }

    // Print double matrix
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%8.3f", val);
            System.out.println();
        }
    }
}
