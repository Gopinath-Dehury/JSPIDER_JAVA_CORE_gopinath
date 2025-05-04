import java.util.Scanner;

public class PrimeNoUsingRecurrsion {


    static boolean isPrime(int n,int i){
        
        if(n<=2)return n==2;
        if(n%i==0) return false;
        if(i*i>n) return true;
        return isPrime(n, i+1);

    }
    public static void main(String[] args) {
        int num;
        while(true){
                    num=new Scanner(System.in).nextInt();
                    System.out.println(isPrime(num,2));

        }
    }
}
