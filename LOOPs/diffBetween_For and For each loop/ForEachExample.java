import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        // Try modifying using for-each loop
        for (int num : nums) {
            num = num * 2; // This has no effect on original array
        }

        System.out.println("Modified with for-each: " + Arrays.toString(nums));
    }
}
