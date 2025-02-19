import java.util.Scanner;

class SumOfDigitsOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        int sum = 0;

        for (int i = 0; n > i; n = n / 10) {
            sum += n % 10;

        }
        System.out.println(sum);
    }
}