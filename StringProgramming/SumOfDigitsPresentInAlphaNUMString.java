public class SumOfDigitsPresentInAlphaNUMString {
    public static int sum(String s) {
        char[] a = s.toCharArray();
        int sum = 0;
        // for(int i=0;i<s.length();i++){
        //     if (a[i] > '0' && a[i] <= '9') {
        //         sum += a[i] - '0';
        //     }
        // }
        for (char i : a) {
            if(i>='0'&&i<='9'){
                sum+=i-'0';
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "a1b2c3d4e5f8";
        System.out.println(sum(s));
    }
}
