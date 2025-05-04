public class SecSmallinArray {
    public static void main(String[] args) {
        int[] a = { 22, 2, 31, 41, 51, 71, 22, 34, 89 };
        int s1, s2;
        if (a[0] < a[1]) {
            s1 = a[0];
            s2 = a[1];
        } else {
            s1 = a[1];
            s2 = a[0];
        }

        for (int i = 2; i < a.length; i++) {
            if (a[i] < s1) {
                s2 = s1;
                s1 = a[i];
            } else if (a[i] < s2) {
                s2 = a[i];
            }
        }
        System.out.println(s2);
    }
}
