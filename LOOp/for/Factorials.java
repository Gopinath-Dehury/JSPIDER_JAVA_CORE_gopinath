import java.util.Scanner;

class Factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number which you want to factorial : ");
        int n = sc.nextInt();
        int prod = 1;
        sc.close();
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        System.out.println(prod);
    }
}
