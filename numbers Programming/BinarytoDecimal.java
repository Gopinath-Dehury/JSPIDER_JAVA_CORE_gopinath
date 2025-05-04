import java.util.Scanner;

public class BinarytoDecimal {
    public static int binarytodecimal(long binary) {
        int decimal = 0;
        int b = 1;
        while (binary > 0) {

            int rem = (int) binary % 10;
            decimal = decimal + rem * b;
            binary = binary / 10;
            b = b * 2;

        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        long binary = sc.nextLong();
        
        System.out.println(binarytodecimal(binary));
    }
}
