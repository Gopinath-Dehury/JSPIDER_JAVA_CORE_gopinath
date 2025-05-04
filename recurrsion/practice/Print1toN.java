package practice;

public class Print1toN {
    static void print(int i,int n){
        if(i>n)return;
        System.out.println(i);
        print(i+1,n);
    }
    static void print1toN(int n){
        print(1,n);
        
        
    }

    public static void main(String[] args) {
        print1toN(3);
    }
}
