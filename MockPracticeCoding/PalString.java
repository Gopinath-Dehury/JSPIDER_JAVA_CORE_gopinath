import java.util.Scanner;

public class PalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int i = 0, j = str.length() - 1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("Not a palindrome string");
                return;// exit the program
            }
            i++;
            j--;
        } 
        System.out.println("Palindrome string");
        sc.close();   
    }
}
