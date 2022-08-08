import java.util.Arrays;

public class P1RunningSum1dArray {

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = arrSum(i + 1, nums);
        }

        return result;
    }

    public static int arrSum(int end, int[] arr) {
        int result = 0;
        for (int i = 0; i < end; i++) {
            result += arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

}
