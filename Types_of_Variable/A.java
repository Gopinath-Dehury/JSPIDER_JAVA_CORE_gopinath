class A {
    static int i = 1;

    public static void main(String[] args) {
        int i=3;
        System.out.println(i);
       // A.i = 2;
        i = 2;
        System.out.println(i);
        
        System.out.println(A.i);
    }
}