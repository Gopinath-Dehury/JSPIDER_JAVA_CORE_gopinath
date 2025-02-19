import java.util.Scanner;

class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the lines :");
        int n = sc.nextInt();
        int m = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                if (i == 3)
                    m = i + 1;
                if (i == 5)
                    m = i * 2 + 1;
                for (int j = 1; j <= i; j++) {
                    System.out.print(m++ + " ");
                }
            } else {
                if (i == 2)
                    m = i + 1;
                if (i == 4)
                    m = i * 2 + 2;
                for (int j = 1; j <= i; j++) {
                    System.out.print(m-- + " ");
                }
            }
            System.out.println();
        }
    }
}
