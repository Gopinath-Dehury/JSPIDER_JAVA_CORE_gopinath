import java.util.Scanner;
class PallindromeString{
 static boolean isPalString(String s){
	char [] a=s.toCharArray();
	int i=0,j=a.length-1;
while(i<j){
if(a[i]!=a[j]) return false;
i++;j--;
}
return true;

}

public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String s=sc.next();

System.out.println(isPalString(s));
}
}