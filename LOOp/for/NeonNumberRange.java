import java.util.Scanner;

public class NeonNumberRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ending range it start from 1 :");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i <= n; i++) {

            int sqr = i * i;
            int sum = 0;
            while (sqr > 0) {
                sum += sqr % 10;
                sqr /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }

    }
}
