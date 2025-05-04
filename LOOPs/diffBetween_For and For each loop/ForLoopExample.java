import java.util.Arrays;

public class ForLoopExample {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        // Modify using regular for loop
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 2;
        }

        System.out.println("Modified with for loop: " + Arrays.toString(nums));
    }
}
