class A{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("236/10 = "+236/10);// here the all operand are integer so the result also the integer.
        System.out.println("236.0/10 = "+236.0/10);//there is a decimal operand so the result also be a decimal value.
        System.out.println("1/2*3*4 = "+ 1/2*3*4);//--> execute left to right   .So 1/2=0 and then 0*3=0 and then 0*4=0. so o/p is "0".
        System.out.println("25%3 = "+25%3);//result will be 1 bcz "%"  is modulus operand and only return the remainder.
        System.out.println("236/10 = "+236/10);//result will be 23
        System.out.println("236%10 = "+236%10); //result will be 6 ,as modulus operator.always return remainder
        System.out.println("236%100 = "+236%100); //result will be 36 as modulus return remainder 
        int a =98; /*here the right side value is assigning to the a variable ,its assignment operators always
                    asign right value to left variable*/
                    System.out.println(a);
        System.out.println();
    }
}