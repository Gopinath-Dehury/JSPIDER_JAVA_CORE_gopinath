import java.util.Scanner;

public class PallindromeNum {
    static boolean isPallindrome(int n) {
        int temp = n;
        int reverse = 0;
        while (n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }
        if (reverse == temp)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPallindrome(i)) {
                count++;
                if (count % 2 != 0)
                    System.out.println(i);
            }
        }

    }
}
