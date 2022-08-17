public class P15ValidateBST {
    public static boolean isValidBST(TreeNode root) {
        return checkNode(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean checkNode(TreeNode curr, long leftBoundary, long rightBoundary) {
        if (curr == null) {
            return true;
        }

        if (curr.val <= leftBoundary || curr.val >= rightBoundary) {
            return false;
        }

        return checkNode(curr.left, leftBoundary, curr.val) 
            && checkNode(curr.right, curr.val, rightBoundary);
    }
}
