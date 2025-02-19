import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check :");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int fact = 1;

        while (n > 0) {
            int rem = n % 10;// catch the last digit in rem variable.Ex -- 123 % 10=3
            while (rem > 0) {
                // this loop use for finding the fact for digit and the
                fact = 1;
                fact *= fact;// this will multiply the number rem(last digits) with fact current value
                rem--;// by this the each number is minus from current number value and that value
                      // will 1st check with loop condition and if true then again multiply that value
                      // with fact.
            }
            sum += fact;// this code will add the fact value for each digits factorial with 'sum' value
                        // and finally store the value in 'sum'
            n /= 10;// this code delete the last digit from the number. EX-- 123 becomes 12.
        }

        if (sum == temp) {
            System.out.println(temp + " is a STRONG NUMBER.");
        } else {
            System.out.println(temp + " is not a STRONG NUMBER.");
        }
    }

}
