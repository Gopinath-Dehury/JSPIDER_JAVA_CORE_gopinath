class Forloop{
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};

        for(int n:a){
            n=n*2;//it does not change the original array values but in case of non-primitive type it change the value of that non primitive object stattes or fields.
            System.out.println(n);
        }
        for(int n:a){
            System.out.println(n);
        }
    }
}