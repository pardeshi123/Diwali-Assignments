import java.util.Arrays;

public class CodingChallenge_23Oct2025 {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }
        System.arraycopy(result, 0, nums, 0, n);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;

        rotate(nums, k);
        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }
}
