public class SecondSmallestinArray {
    public static void main(String[] args) {
        int[] a = { 3, 8, 4, 3, 5, 7, 9, 12 };
        int s1=a[0];
        int s2=a[0];

        for (int i = 1; i < a.length; i++) {
            if (s1 == a[i]) continue;
            if(a[i]<s1) {
                s2 = s1;
                s1 = a[i];
            }else if(s2>a[i] && s1==s2){
                s2=a[i];
            }
        }

        System.out.println(s2);

    }
}
