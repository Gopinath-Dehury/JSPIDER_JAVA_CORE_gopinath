//same method name different parameter means different datatype and length parameter 
class Test {
    public static void main(String[] args) {
        m1();
        m1(10, 20);
        m1(10, 20, 5.5);
        m1(10, 20, 78);

    }

    public static void m1() {
        System.out.println("m1()");
    }

    public static void m1(int i, int j) {
        System.out.println("m1(int i,int j) :" + i + " , " + j);
    }

    public static void m1(int i, int j, double d) {
        System.out.println("m1(int i,int j,double d) : " + i + " , " + j + " , " + d);
    }
}