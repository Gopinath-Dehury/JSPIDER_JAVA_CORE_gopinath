public class pr {
    public static void main(String[] args) {
        int n=5;
        pri(1,n);
    }

    public static void pri(int n)


    public static void pri(int n,int d){
        if(n>d) return;
        System.out.println(n);
       pri(n+1, d);
    }
}
