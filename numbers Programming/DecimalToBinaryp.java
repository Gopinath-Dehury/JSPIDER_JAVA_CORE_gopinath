import java.util.Scanner;

public class DecimalToBinaryp {
    public static long decimalToBinary(int decimal) {
        if (decimal == 0) {
            return 0;
        }

        long binary = 0, multiplier = 1;

        while (decimal > 0) {
            binary = binary + ((decimal & 1) * multiplier);
            decimal >>= 1;
            multiplier *= 10;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        for (int i = start; i <= end; i++) {
            System.out.println(decimalToBinary(i));
        }
    }
}
