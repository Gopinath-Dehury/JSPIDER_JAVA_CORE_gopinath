//Neon number is a number that is equal to sum of digits of its sqaure.
//for example 9 squre =81 and 8+1=9 which is equal to number itself.
//so in that way 9 is a Neon Number

import java.util.Scanner;

class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to Check it is neon or not :");
        int n = sc.nextInt();
        int sqr = n * n;
        int sum = 0;
        while (sqr > 0) {
            int rem = sqr % 10;//store the last digit in rem of that number
            sum += rem;// add the last number with the sum variable and assign it to again in that sum variable
            sqr /= 10;//delete the last digit from that number. 
        }
        if (sum == n)
            System.out.println(n + " is a NEON Number.");
        else
            System.out.println(n + " is not a NEON Number.");

    }
}