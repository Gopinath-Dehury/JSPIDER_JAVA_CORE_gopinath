class Automorphic{
    public static void main(String[]arg){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int sq = n*n;
        int temp = n;
        int count = 0;
        while(temp>0){
            count++;
            temp = temp/10;
        }
        int last = sq%(int)Math.pow(10,count);
        if(n==last){
            System.out.println("Automorphic Number");
        }else{
            System.out.println("Not Automorphic Number");
        }
    }
}