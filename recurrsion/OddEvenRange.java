public class OddEvenRange {
    public static void main(String[] args) {
        m1(1, 100);
    }

    private static int m1(int start, int end) {
        if (start > end)
            return 0;
        if (start % 2 != 0)// odd //if(start%2==0) //even
            System.out.println(start);
        return m1(start + 1, end);

    }
}