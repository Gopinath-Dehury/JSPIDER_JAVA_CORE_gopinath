import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to  convert into word FORM : ");
        int n = new Scanner(System.in).nextInt();
        pw(n / 10000000, " Crore ");
        pw((n / 100000)%100, " Lakhs ");
        pw((n / 1000) % 100, " Thousands ");
        pw((n / 100) % 10, " Hundred ");
        pw(n % 100, "");

    }

    public static void pw(int n, String s) {
        String[] one = {
                "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
                "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };
        String[] two = {
                "", "", "Twenty", "Thirty", "Forty", "Fifty",
                "Sixty", "Seventy", "Eighty", "Ninety"
        };

        if (n <= 19) {
            System.out.print(one[n] + " ");
        } else {
            System.out.print(two[n / 10] + " " + one[n % 10]);
        }
        if (n != 0)
            System.out.print(s);
    }
}
