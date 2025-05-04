public class StringConatinsPalSubstrprint {
    public static boolean isPal(String s, int start, int end) {
        char[] a = s.toCharArray();
        int i = start, j = end;
        while (i < j) {
            if (a[i] != a[j])
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "banana";
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isPal(s, i, j)) {
                    count++;
                    System.out.println(s.substring(i, j + 1));
                }
            }
        }
        System.out.println(count);
    }
}
