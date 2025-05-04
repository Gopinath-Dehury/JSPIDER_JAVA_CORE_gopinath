import java.util.Scanner;

class PrintconsecutivePalStringinString {
    static boolean isPallindrome(String s, int start, int end) {
        s = s.toLowerCase();
        char[] a = s.toCharArray();
        int i = start, j = end;
        while (i < j) {
            if (a[i] != a[j])
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                {

                    if (isPallindrome(s, i, j))
                        System.out.println(s.substring(i, j + 1));
                }

            }
        }
        scan.close();
    }
}