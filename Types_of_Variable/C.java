public class C {
    static int i=1;
    public static void main(String[] args)
    {
        System.out.println(i);//referes to static variable
        int i =10;
        System.out.println(i);// referes to local variable
        System.out.println(C.i); //refers to static variable
    }

}
