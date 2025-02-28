class H {

    static int m1(int a) {
        System.out.print(a++ + " , stastic method .   ");
        System.out.println(a);
        return a++;
    }

    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        j = m1(++i) + m1(i++);

        System.out.println(i + "..................." + " , " + j);
        System.out.println(i);
        System.out.println(j);
    }
}
