import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class  REGex {
    public static void main(String[] args) {
        String str = "ffffvghv5g";
        String regex = ".*[0-9].*";
        Matcher m=Pattern.compile(regex).matcher(str);
        boolean matches = str.matches(regex);
        System.out.println("Does the string match the regex? " + matches);
    }
    
}
