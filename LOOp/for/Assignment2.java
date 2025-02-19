import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        int evensum = 0;
        int oddsum = 0;
        // int sum=0;
        while (num > 0) {
            int temp = num % 10;
            // System.out.println(temp);
            if (temp % 2 == 0) {
                evensum += temp;
                // System.out.println(evensum);
            } else {
                oddsum += temp;
                // System.out.println(oddsum);

            }
            num /= 10;
        }
        System.out.println("oddsum : " + oddsum);
        System.out.println("evensum : " + evensum);

    }
}
