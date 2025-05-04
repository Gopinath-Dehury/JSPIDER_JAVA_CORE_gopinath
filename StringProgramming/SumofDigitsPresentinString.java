import java.util.Scanner;

public class SumofDigitsPresentinString {
    static int adddigitonly(String s) {
        int sum = 0;
        int i = 0, j = s.length();
        while (i < j) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                sum += s.charAt(i) - '0';
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(adddigitonly(s));
        sc.close();
    }
}
