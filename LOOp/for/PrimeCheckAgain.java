
// Prime number is a numbe rwhich is only divisible by one and itself.
// It is not diisible by any other number Except 1 and that number only. 
//
//
//
//
//
//
//
import java.util.Scanner;

public class PrimeCheckAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check it is PRIME OR NOT :");
        int num = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }

        }
        if (num > 1 && flag) {
            System.out.println(num + " is a PRIME NUMBER.");
        } else {
            System.out.println(num + " is not a PRIME NUMBER.");

        }

    }
}
