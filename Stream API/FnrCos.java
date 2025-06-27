import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FnrCos {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("suryansh", "anshunla", "anurag", "mita", "jugalu", "hirish", "gopinath");
        LinkedHashMap<Character, Long> collect = list.get(1).chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new,
                Collectors.counting()));

                Character character = collect.entrySet().stream().filter(x->x.getValue()==1).
                map(Map.Entry::getKey).findFirst().get();
                System.out.println(character);
    }
}
