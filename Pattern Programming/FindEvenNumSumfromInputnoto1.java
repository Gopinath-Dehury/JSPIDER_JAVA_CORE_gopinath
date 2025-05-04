import java.util.Scanner;

public class FindEvenNumSumfromInputnoto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  num from where you want find even num's sum upto 1 :");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                sum += n;
                System.out.println(n);
            }
            n--;
        }
        System.out.println(sum);
    }
}
