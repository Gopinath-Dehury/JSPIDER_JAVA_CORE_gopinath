import java.util.Scanner;

public class PallindromeStringCheckUsingRecc {
    static boolean isPal(String s, int i, int j) {
        if (i >= j)
            return true;
        if (s.charAt(i) != s.charAt(j))
            return false;
        return isPal(s, i + 1, j - 1);
    }

    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        System.out.println(isPal(s, 0, s.length() - 1));
    }
}
