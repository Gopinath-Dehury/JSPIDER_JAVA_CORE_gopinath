import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNRCFS {
    public static void main(String[] args) {
        String s="adityanatha";
        char c=s.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey).findFirst().get();
        System.out.println(c);
    }
}
