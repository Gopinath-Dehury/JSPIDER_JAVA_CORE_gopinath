import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestElement {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,60,70,50,30,20,24);
        int sle=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(sle);
    }
}
