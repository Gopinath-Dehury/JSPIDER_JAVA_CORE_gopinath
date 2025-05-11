import java.util.LinkedHashMap;
import java.util.Map;

class Romaniser {
    public static String romaniser(int n) {
        Map<Integer, String> m = new LinkedHashMap<>();
        m.put(1000, "M");
        m.put(900, "CM");
        m.put(500, "D");
        m.put(400, "CD");
        m.put(100, "C");
        m.put(90, "XC");
        m.put(50, "L");
        m.put(40, "XL");
        m.put(10, "X");
        m.put(9, "IX");
        m.put(5, "V");
        m.put(4, "IV");
        m.put(1, "I");
        StringBuilder res = new StringBuilder("");
        for (int key : m.keySet()) {
            while (n >= key) {
                res.append(m.get(key));
                n -= key;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int n=1040;
        System.out.println(romaniser(n));
    }
}