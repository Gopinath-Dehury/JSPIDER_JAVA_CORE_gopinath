import java.util.Scanner;

class Assignment3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        long n = sc.nextLong();
        sc.close();
        int count = 0;
        for (int i = 1; i <= n; n /= 10) {
            count++;
        }
        System.out.println("The Number  you have enter is of digits = " + count);
    }
}
