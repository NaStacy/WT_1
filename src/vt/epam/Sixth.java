package vt.epam;

public class Sixth {
    public static void main(String[] args) {
        System.out.println("6. Даны действительные числа a1, a2, …, an. Получить заданную квадратную матрицу порядка n.");
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        int[][] matrix = createMatrix(array);
        printMatrix(matrix);
    }

    private static int[][] createMatrix(int[] a) {
        int[][] matrix = new int[a.length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                matrix[i][j] = a[(j + i) % a.length];
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%d ", num);
            }

            System.out.println();
        }
    }
}