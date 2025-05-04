import java.util.Scanner;

public class SeparateINTCHARinto2string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String num = "";
        String CHAR = "";
        char[] a = s.toCharArray();

        for (char c : a) {
            if (c >= '0' && c <= '9') {
                num += c;
            } else if (c >= 'A' && c <= 'z')
                CHAR += c;
        }
        System.out.println(num + "   " + CHAR);

        sc.close();
    }

}
