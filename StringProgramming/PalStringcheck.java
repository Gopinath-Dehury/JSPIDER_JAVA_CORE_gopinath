import java.util.Scanner;

public class PalStringcheck {
    public static boolean ispalString(String s) {
        s = s.toLowerCase();
        char[] a = s.toCharArray();
        int i = 0, j = a.length - 1;
        while (i < j) {
            if (a[i] != a[j])
                return false;
                i++;
                j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (ispalString(s)) {
            System.out.println(s + " a is Pallindrome String.");
        } else {
            System.out.println(s + " a is not Pallindrome String.");
        }
    }
}
