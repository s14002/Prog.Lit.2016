import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            int H = scan.nextInt(), W = scan.nextInt();
            if(H == 0 && W == 0) break;
                for(int i = 0; i < H; i++) {
                    for(int j = 0; j < W; j++) {
                        if(i == 0 || j == 0 || i == H -1 || j == W -1) {
                            System.out.print("#");
                        } else {
                            System.out.println(".");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
        }
    }
}
