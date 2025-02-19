class StaticVar{
    static int i;
    //static variable are declare with in the class not inside the method using "static" keyword
    public static void main(String[] args) {
        //for static variable, memory allocated at the time of class loading
        StaticVar S1=new StaticVar();
        S1.i=10;
        System.out.println(S1.i);

        StaticVar S2= new StaticVar();
        S2.i= 20;
        System.out.println(S2.i);//20
        System.out.println(S1.i);//20
        System.out.println(StaticVar.i);//20
        System.out.println(i);//20  Here also without creating object we can access the static variable
        /*  in static variable there is only one memory is created and we can only reassign the value 
        and also can access by object reference and className and also DIRECT(LIKE 'i' only in peint statement)  
        but it make confusion of non static avriable so its not 
         recommended at all*/
    }
}