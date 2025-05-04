import java.util.Scanner;

public class DecimalToBinary {
    public static long decimalToBinary(long decimal) {
        if (decimal == 0)
            return 0;
        long binary = 0;
        long multiplier = 1;
        while (decimal > 0) {
            binary = binary + ((decimal & 1) * multiplier);// decimal%2 = decimal & 1 it will git bits from least
                                                           // significant bit(the rightmost bit)
            decimal >>= 1;// or equals to decimal /= 2;
            multiplier *= 10;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long start = s.nextLong();
        long end = s.nextLong();
        // long l = s.nextLong();
        s.close();

        for (long i = start; i <= end; i++) {
            System.out.println(i + "\t" + decimalToBinary(i));

        }
    }
}
