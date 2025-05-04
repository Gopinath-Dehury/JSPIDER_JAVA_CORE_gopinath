import java.util.Scanner;

public class FstHalfAndlastHalfReverseOfAString1 {

    public static String rev(String s, int start, int end) {
        char[] a = s.toCharArray();
        int i = start, j = end;
        while (i < j) {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return new String(a);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String bhai :");
        String s = sc.next();
        int len = s.length();
        s = rev(s, 0, (len / 2) - 1);
        s = rev(s, len - len / 2, len - 1);
        System.out.println(s);
    }
}
