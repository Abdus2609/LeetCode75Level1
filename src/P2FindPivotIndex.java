public class P2FindPivotIndex {

    public static int pivotIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (isPivot(i, nums) != -1) {
                return i;
            }
        }

        return -1;
    }

    public static int isPivot(int index, int[] arr) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                leftSum += arr[i];
            } else if (i > index) {
                rightSum += arr[i];
            }
        }

        if (leftSum == rightSum) {
            return index;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(pivotIndex(nums));
    }

}