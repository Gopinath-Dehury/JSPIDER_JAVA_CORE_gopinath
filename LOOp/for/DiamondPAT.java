import java.util.Scanner;

public class DiamondPAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter line number :");
        int n = sc.nextInt();

        int spaces = n / 2;// also can use n-1 it will print right side to the corner of left
        // n/2 print the diamondleft side border touch
        int stars = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("X");
            }

            System.out.println();
            if (i < n / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }
    }

}
