import java.util.Scanner;

class primeAlternate {
    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start range : ");
        int start = sc.nextInt();
        System.out.println("Enter the end range : ");
        int end = sc.nextInt();
        sc.close();
        int count = 0;
        // for (int i = start; i <= end; i++) {
        for (int i = end; i >= start; i--) {
            if (isPrime(i)) {
                count++;
                // if (count % 2 != 0)
                if (count == 3) {
                    System.out.println(i);
                    break;
                }

            }
        }
    }
}