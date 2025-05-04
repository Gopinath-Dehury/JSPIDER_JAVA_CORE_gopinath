package StringProgramming;

import java.util.Scanner;

public class FstHalfAndlastHalfReverseOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = sc.next();
        char[] a = s.toCharArray();
        int i = 0, j = (a.length / 2) - 1;
        for (int k = 1; k <= 2; k++) {
            while (i < j) {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            i = s.length() - s.length() / 2;
            j = s.length() - 1;
        }
        System.out.println(new String(a));
    }
}
