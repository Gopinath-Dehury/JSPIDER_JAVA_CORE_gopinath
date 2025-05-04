import java.util.Scanner;

public class ReverseAnyString {
    static String getReverseString(String s) {
        char[] a = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        String s2 = new String(a);
        return s2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(getReverseString(s));
        sc.close();
    }
}
