import java.util.Scanner;

public class leftpintedtriangle {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        int spaces=n/2;
        int stars=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<=n/2){
                spaces--;
                stars++;
            }else{
                spaces++;
                stars--;
            }
        }
    }
}
