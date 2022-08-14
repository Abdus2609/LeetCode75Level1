import java.util.*;

public class P12BinTreeLevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> tree = new ArrayList<>();
        List<Integer> vals = new ArrayList<>();
        if (root == null) {
            return tree;
        }

        LinkedList<TreeNode> currLevel = new LinkedList<>();
        LinkedList<TreeNode> nextLevel = new LinkedList<>();
        currLevel.add(root);
        while (!currLevel.isEmpty()) {
            TreeNode currNode = currLevel.poll();

            if (currNode.left != null) {
                nextLevel.add(currNode.left);
            }
            if (currNode.right != null) {
                nextLevel.add(currNode.right);
            }

            vals.add(currNode.val);
            if (currLevel.isEmpty()) {
                currLevel = nextLevel;
                nextLevel = new LinkedList<>();
                tree.add(vals);
                vals = new ArrayList<>();
            }
        }

        return tree;
    }
}