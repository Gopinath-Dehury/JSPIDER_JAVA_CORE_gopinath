import java.util.Scanner;

public class NumToWord {

    public static void pw(int n, String s) {
        String[] one = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
        String[] two = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        if (n <= 19) {
            System.out.print(one[n] + " ");
        } else {
            System.out.print(two[n / 10] + " " + one[n % 10]);
        }
        if (n != 0) {
            System.out.print(s);
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter the number : ");
            int n = sc.nextInt();
            pw(n / 10000000, " Crore ,");
            pw((n / 100000) % 100, " Lakhs ,");
            pw((n / 1000) % 100, " Thousands ,");
            pw((n / 100) % 10, " Hundreds ");
            pw(n % 100, ".");
            System.out.print("\n---------------");
            if (n == 0)
                break;
        }

    }
}
