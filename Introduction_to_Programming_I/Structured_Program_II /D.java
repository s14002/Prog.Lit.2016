import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt(), l = scan.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[m][l];
        long[][] c = new long[n][l];

        // a
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        // b
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                b[i][j] = scan.nextInt();
            }
        }

        // c
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                for (int k = 0; k < m; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j]);
                if (j != l -1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
