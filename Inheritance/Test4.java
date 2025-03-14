 class D {
    int i;
    int j;
    D(){
        j=20;
    }
    D(int i){
        this();//new D();
        this.i=i;
    }
}
public class Test4{
    public static void main(String[] args) {
    
        D d=new D(10);
        System.out.println(d.i);
        System.out.println(d.j);
    }
}