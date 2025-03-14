class D {
    static {
        System.out.println("static block-D");
    }
    {
        System.out.println("instance block-D");
    }

    D() {
        System.out.println("Default Constructor-D");
    }
}

class Test2 {
    public static void main(String[] args) {
        System.out.println("main start ...");
        new D();//
        new D();
        System.out.println("main end ...");
    }
}

// main start ...
// static block-D
// instance block-D
// Default Constructor-D
// instance block-D     
// Default Constructor-D
// // main end ...