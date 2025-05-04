class AddonlynumfromString{
static int addsum(String s){
	int sum=0;

for(int i=0;i<s.length();i++){
if(s.charAt(i)>='0' && s.charAt(i)<='9'){
sum+=s.charAt(i)-'0';
}
}
return sum;
}
public static void main(String[]args){
System.out.println(addsum("6g7f4e5y60j"));
}
}