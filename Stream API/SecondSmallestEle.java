import java.util.Arrays;
import java.util.List;

public class SecondSmallestEle {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(89,78,89,56,45,34,89,98);
        System.out.println(list.stream().sorted().skip(1).findFirst().get());
    }
}
