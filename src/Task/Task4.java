package Task;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        int[] B = new int[rows];
        for (int i = 0; i < rows; i++) {
            int maxIndex = 0;
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] > matrix[i][maxIndex]) {
                    maxIndex = j;
                }
            }
            B[i] = maxIndex;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] /= (B[i] + 1);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
