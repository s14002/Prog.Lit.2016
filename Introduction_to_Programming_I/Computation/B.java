import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double a = r*r*Math.PI;
        double c = r*2*Math.PI;
        System.out.printf("%.6f %.6f", a, c);
    }
}
