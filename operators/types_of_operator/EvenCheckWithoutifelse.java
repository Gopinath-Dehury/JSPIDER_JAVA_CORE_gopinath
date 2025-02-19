import java.util.Scanner;

class EvenCheckWithoutifelse {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number to check :"); 
       int n = sc.nextInt();
       sc.close();
      String result=n%2==0?"Even Number.":"Odd Number.";
      System.out.println("The number  "+n +" is "+result);
   } 
}
