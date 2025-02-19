class Assignment_operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = 66;

        int d = a > b ? a : b;
        int e = d > c ? d : c;
        System.out.println("The greatest number is = " + e);
    }
}