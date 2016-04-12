import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt(), H = scan.nextInt(), x = scan.nextInt(), y = scan.nextInt(), r = scan.nextInt();

        if(x + r <= W && y + r <= H && x - r >= 0 && y - r >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
