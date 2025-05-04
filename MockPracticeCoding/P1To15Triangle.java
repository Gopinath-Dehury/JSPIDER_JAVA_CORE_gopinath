import java.util.Scanner;

public class P1To15Triangle {
    public static void main(String[] args) {
        int a = 1;
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ +"\t");
            }
            System.out.println();
        }
    }
}
