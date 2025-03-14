class E{
    {
        System.out.println("non-static block -E");
    }
    E(){
        System.out.println("Default Constructor-E");
    }
    E(int i){
        System.out.println("Parameterized Constructor-E");
    }
}
class Test3 {
    public static void main(String[] args) {
        new E();
        System.out.println("-----------------");
        new E();
    }
    
}
// non-static block -E
// Default Constructor-E
// -----------------
// non-static block -E
// Parameterized Constructor-E