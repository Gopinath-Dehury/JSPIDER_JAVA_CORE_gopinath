import java.util.Scanner;

public class SumofNumberPresentintALPHAnumericString {
    public static void main(String[] args) {
        System.out.println("Enter a ALPHANUMERIC String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a >= '0' && a <= '9') {
                sum += a - '0';
            }

        }
        System.out.println(sum);
    }

}
