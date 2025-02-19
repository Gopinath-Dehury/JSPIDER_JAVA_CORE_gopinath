//Pallindrome Number is a number which it equal to its reverse number for example 1221=1221.
// so we have to reverve the number and check whether it is same with the original number or not.

import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to checkit is  Pallindrome no or not : ");
        int n = sc.nextInt();
        int m = n;
        int reverse = 0;
        while (n > 0) {
            int rem = n % 10;// take the last digit from the given number. if n= 345 it will take 5 from the
                             // number
            reverse = reverse * 10 + rem;// here we store the last digit in a new number and it will add next number one
                                         // by one and when the loops run//
            // above code add the digits in the unit position so that last one become 1st
            // one in new number .345 becomes 543.
            n /= 10;// this will delete the last digit from original number one by one with loop
                    // runs
        }
        if (reverse == m) {
            System.out.println(m + " is a PALLINDROME NUMBER.");
        } else {
            System.out.println(m + " is a not PALLINDROME NUMBER.");
        }

    }
}
// Reverse a Number Logic
// get the last digit by doing %)modulus with 10
// then to add numbers in unit digits we can use >>> reverse=reverse*10+rem
// example-- 125
// n%10=rem; _____________rem+10*reverse=reverse n
// 125%10=5then___________ 5+10*0=5 _____12 ______LOOP1
// 12%10=2then ___________ 2+10*5=52 _____1 ______LOOP2
// 1%10=1then _____________1+10*52=521___ 0 ______LOOP3
