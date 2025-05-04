public class FindsumofdigitTakeCONNumAsONENUMmethod {
    static int addConNums(String s) {
        char[] a = s.toCharArray();
        int sum = 0;
        int i = 0;
        while (i < a.length) {
            int n = 0;
            while (i < a.length && a[i] >= '0' && a[i] <= '9') {
                n = (n * 10) + (a[i] - '0');
                i++;
            }
            System.out.println(n);
            sum += n;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addConNums("n111j2n222jn222hy666"));
    }
}
