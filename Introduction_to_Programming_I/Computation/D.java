import java.util.*;

public class D {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] a = new int[n];
            int max = -1000000, min = 1000000, input;
            long sum = 0;

            for(int i = 0; i < n; i++) {
                input = scan.nextInt();
                if(input > max) max = input;
                if(input < min) min = input;
                sum += input;
            }
                System.out.println(min + " " + max + " " + sum);
    }
}
