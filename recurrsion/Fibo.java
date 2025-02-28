import java.util.Scanner;

class Fibo {
    static int fib(int i) {
       
        if (i == 1)
            return 0;
        if (i == 2)
            return 1;
        return fib(i - 1) + fib(i - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter index :");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
