public class FindsumofdigitTakeCONNumAsONENUM {
    public static void main(String[] args) {
        String s = "kjwdc2763b726f6253";
        char[] a = s.toCharArray();
        int sum = 0;
        int i = 0;
        // 2763+726+6253=9742
        while (i < a.length) {
            int n = 0;
            while (i < a.length && a[i] >= '0' && a[i] <= '9') {
                n = (n * 10) + (a[i] - '0');
                i++;
            }
            sum += n;
            i++;
        }
        System.out.println(sum);

    }
}