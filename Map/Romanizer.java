import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Romanizer {
    public static String convert(int n) {
        StringBuilder s = new StringBuilder("");
        Map<Integer, String> m = new LinkedHashMap<>();

        m.put(1, "I");
        m.put(4, "IV");
        m.put(5, "V");
        m.put(9, "IX");
        m.put(10, "X");
        m.put(40, "XL");
        m.put(50, "L");
        m.put(90, "XC");
        m.put(100, "C");
        m.put(400, "CD");
        m.put(500, "D");
        m.put(900, "DM");
        m.put(1000, "M");

        int a[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        for (int value : a) {
            while (n >= value) {
                s.append(m.get(value));
                n -= value;
            }
        }

        return s.toString();

    }

    public static void main(String[] args) {
        System.out.println(convert(412));
    }
}
