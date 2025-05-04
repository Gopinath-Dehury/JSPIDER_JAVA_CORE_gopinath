public class NumberSumFromAlphanumericString {
    public static int sum(String s) {
        char[] a = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            int num = 0;
            while (i < a.length && (a[i] >= '0' && a[i] <= '9')) {
                num = num * 10 + (a[i] - '0');

                i++;
            }
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "abs1001ws21sw2000r10000";
        System.out.println(sum(s));
    }
}
