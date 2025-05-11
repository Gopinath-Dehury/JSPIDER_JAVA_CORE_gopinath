package StringProgramming;

public class InttoWord {

    public static void printW(int n, String s) {
        String[] one = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
        String[] two = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        if (n <= 19) {
            System.out.print(one[n] + " ");
        } else {
            System.out.print(two[n / 10] + " " + one[n % 10] );
        }
        if (n > 0)
            System.out.print(s + " ");
    }

    public static void main(String[] args) {
        int n = 3206;
        printW(n / 10000000, "Crore");
        printW((n / 100000) % 100, "Lakhs");
        printW((n / 1000) % 100, "Thousand");
        printW((n / 100) % 10, "Hundred");
        printW(n % 100, "");

    }
}
