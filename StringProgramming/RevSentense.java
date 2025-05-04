public class RevSentense {
    public static void main(String[] args) {

        String s = "java is easy gopinath";
        char[] a = s.toCharArray();
        int i = s.length() - 1;
        int j = s.length() - 1;
        String s1 = "";
        while (i >=0) {
            while (i>=0 && a[i] != ' ') i--;

            String s2 = "";
            int k = i + 1;
            while (k <= j) {
                s2+=a[k++];
                

            }
            s1 += s2;
            if (i > 0)
                s1+=" ";
            j=i--;
            // j = i;
        }
        System.out.println(s1);
        
    }
}