import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int m = scan.nextInt(), f = scan.nextInt(), r = scan.nextInt();
            if (m == -1 && f == -1 && r == -1) break;

            if (m == -1 || f == -1) {
                System.out.println("F");
            } else if ((m + f) >= 80) {
                System.out.println("A");
            } else if ((m + f) >= 65 && (m + f) < 80) {
                System.out.println("B");
            } else if (((m + f) >= 50 && (m + f) < 65) || ((m + f) >= 30 && (m + f) < 50 && (50 <= r))) {
                System.out.println("C");
            } else if ((m + f) >= 30 && (m + f) < 50 && !(50 <= r)) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }


    }
}
