import java.util.Scanner;

public class SumofdigitpresentinString {
    static int digitsum(String s) {
        char[] a = s.toCharArray();
        int sum = 0;
        for (char c : a) {
            if (c >= '0' && c <= '9')
                sum += c - '0';
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(digitsum(s));
        sc.close();
    }
}
