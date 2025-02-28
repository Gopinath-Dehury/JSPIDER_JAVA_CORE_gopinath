class B {
 int i;//Non static var
 static void m1(){
    System.out.println();
 }   
 void m2(){
    System.out.println(i);
 }
}
class Test2{
    public static void main(String[] args) {
        B b1=new B();
        b1.i=10;
        B b2=new B();
        b2.i=20;
        b1.m2();
        b2.m2();
    }
}