import java.util.Scanner;

public class ArmStrongNumber {
    static boolean isArmStrong(int n){
        int temp=n,count=0,sum=0;
        while(n>0){
            n/=10;
            count++;
        }
        n=temp;
        while(n>0){
            sum+=(int)Math.pow((n%10),count);
            n/=10;
        }
        return sum==temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to check armStrong :");
        int num=sc.nextInt();
        if(isArmStrong(num))
            System.out.println(num+" is ARMSTRONG.");
        else
        System.out.println(num+ " is not ARMSTRONG.");


        System.out.println("enter range:");
        int start=sc.nextInt();
        int end=sc.nextInt();
        int c=0;
        for(int i=start;i<=end;i++){
            if(isArmStrong(i)){
                c++;
                // if(c%2!=0)
                if(c==1)
            System.out.println(i);
            }
        }

    }
}
