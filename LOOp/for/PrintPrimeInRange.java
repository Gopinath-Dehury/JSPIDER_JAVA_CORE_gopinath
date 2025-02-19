import java.util.Scanner;

public class PrintPrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("start range :");
        int start = sc.nextInt();
        System.out.println("End range :");
        int end = sc.nextInt();
        for (int i = end; i >= start; i--) {//for(int i=start;i<=end;i++)
            {

                boolean flag = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        flag = false;
                    }

                }
                if (i > 0 && flag) {
                    System.out.println(i);
                }
            }
        }

    }
}