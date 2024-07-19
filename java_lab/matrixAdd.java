import java.util.*;

public class matrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        int[][] mat2 = new int[r][c];
        int[][] sum = new int[r][c];

        System.out.println("Enter " + (r * c) + " elements to matrix1 : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter " + (r * c) + " elements to matrix2 : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of two matrix : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = mat[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
