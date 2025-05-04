import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String text = "Email: test@example.com";
        String pattern = "\\w+@\\w+\\.\\w+"; // Pattern to match an email

        Pattern p = Pattern.compile(pattern); // Compile regex
        Matcher m = p.matcher(text); // Match regex in text

        if (m.find()) {
            System.out.println("Found: " + m.group());
        } else {
            System.out.println("No match found");
        }
    }
}
