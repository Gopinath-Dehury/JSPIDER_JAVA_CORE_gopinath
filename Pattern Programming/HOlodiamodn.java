import java.util.Scanner;

public class HOlodiamodn {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        int space=n/2;
        int stars=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                if(j==1||j==stars)
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(i<n/2){
                space--;
                stars+=2;
            }else{
                space++;
                stars-=2;
            }
        }
    }
}
