public class BalancedString {

    public static void main(String[] args) {

        String s = "{uyf875#[hhyfyugd(RavishSir)jhf]jhjh}";
        System.out.println(isBalancedString(s));

    }

    public static boolean isBalancedString(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '}' || c == '(' || c == ')' || c == '[' || c == ']') {
                s1 += c;
            }
        }
        while (s1.contains("{}") || s1.contains("[]") || s1.contains("()")) {
            s1 = s1.replace("{}", "");
            s1 = s1.replace("()", "");
            s1 = s1.replace("[]", "");
        }
        return s1.isEmpty();
    }
}
