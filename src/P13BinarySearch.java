import java.util.Arrays;

public class P13BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (nums[midIndex] == target) {
                return midIndex;
            } else if (nums[midIndex] > target) {
                endIndex = midIndex - 1;
            } else if (nums[midIndex] < target) {
                startIndex = midIndex + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(binarySearch(nums, target));
    }
}
