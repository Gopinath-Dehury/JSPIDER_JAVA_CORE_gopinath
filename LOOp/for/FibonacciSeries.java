//  FIBONACCI SEQUENCE /SERIES IS RESULT OF ADDITION OF 1ST 2 NUMBER = 3RD UMBER AS SO ON. 0 1 1 2 3 5 8 13 21 34

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the FIBONACCI SERIES UPTO THAT NUMBER :");
        int n = sc.nextInt();

        int a = 0, b = 1;
        // while(a<=n) will print the fibonacci series lesser than n means 0 to n.
        // fibonacci series < n for example if n =100 it will print all the fibonacci
        // series from 0-100
        while (a <= n) // for(int i=1;i<=n) this loop print n number of fibonacci series number from 0
                       // it means IF N=10 ,10 NUMBERS WILL BE PRINTED from that series from 0.
        {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
