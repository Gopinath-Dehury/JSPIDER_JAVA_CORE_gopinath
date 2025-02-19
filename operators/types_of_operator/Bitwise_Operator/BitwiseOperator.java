import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        // int a = 21, b = -37;
        int c = a & b;
        System.out.println(c);
        System.out.println("000000000000000000000000000" + (Integer.toBinaryString(a)));
        System.out.println(Integer.toBinaryString(b));
    }
}
