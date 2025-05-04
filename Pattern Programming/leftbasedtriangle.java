import java.util.Scanner;

public class leftbasedtriangle {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        int stars=1;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();

            if(i<=n/2) stars++;
            else stars--;

        }
    }
}
