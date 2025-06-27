import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterFromaString {
    public static void main(String[] args) {
        String s = "hello";

        Map<Character, Long> collect = s.chars().mapToObj(x -> (char) x).collect( Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new,
                Collectors.counting()));

        char FirstNonRepeatingCharacter = collect.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().get();

        System.out.println(FirstNonRepeatingCharacter);
    }
}