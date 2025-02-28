class A {
    public static void m1(double d, int i) {
        System.out.println(d + " " + i);
    }

    public static void m1(int i, double d) {
        System.out.println(i + " " + d);
    }

    public static void main(String[] args) {
        m1(5, 5.7);
        m1(5.5, 7);
        // m1(5, 5); //here 5 and 5 can be auto wideing to double so compiler get
        // ambiguous
        // CTE both method m1(double,int) in A and method m1(int,double) in A match
        // error: reference to m1 is ambiguous
        // m1(5,5);
        // ^
        //
    }
}
