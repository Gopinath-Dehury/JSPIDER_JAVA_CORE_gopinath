import java.util.Scanner;

public class ArmStrong {
    public static boolean isARMSTRONG(int a) {
        int temp = a, count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        temp = a;
        int sum = 0;
        while (temp > 0) {
            sum += (int) Math.pow((temp % 10), count);
            temp /= 10;
        }
        return a == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isARMSTRONG(i)) {
                count++;

                if (count%2 != 0)
                    System.out.println(i);
            }
        }
        sc.close();
    }
}
