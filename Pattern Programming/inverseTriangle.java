import java.util.Scanner;

public class inverseTriangle {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();

        int stars=n*2-1;
        int spaces=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            for(int  j=1;j<=stars;j++){
                //if(i==1||j==1||j==stars){
                    System.out.print("* ");
                // }else{
                //     System.out.print("  ");
                // }
            }
            System.out.println();
            stars-=2;
            spaces++;
        }
    }
}
