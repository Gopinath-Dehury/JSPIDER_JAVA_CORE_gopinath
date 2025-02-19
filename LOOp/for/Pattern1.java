import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {// control row
            for (int j = n; j >= i; j--) {// control char in in row
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
