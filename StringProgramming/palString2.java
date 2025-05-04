import java.util.Scanner;

public class palString2 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        s = s.toLowerCase();
        char[] a = s.toCharArray();
        int i = 0, j = a.length - 1;
        int f = 0;
        while (i < j) {
            if (a[i] != a[j]) {
                f = 1;
                break;
            }
            i++;
            j--;
        }
        if (f == 0) {
            System.out.println(s + " is a pallindrome string.");
        } else {
            System.out.println(s + " is a not pallindrome string.");

        }
    }
}
