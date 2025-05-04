import java.util.Scanner;

public class Reverseholotriangle {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int stars = n * 2 - 1;
        int spaces = 0;
        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = 1; j <= spaces; j++) {
                System.err.print("  ");
            }
            //for star and inbetween spaces
            for (int j = 1; j <= stars; j++) {
                if(j==1||j==stars||i==1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }

            System.out.println();
            spaces++;
            stars -= 2;
        }

    }
}
