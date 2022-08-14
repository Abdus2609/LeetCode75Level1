import java.util.*;

public class P11NaryTreePreorderTraversal {

    public static List<Integer> predorder(Node root) {

        List<Integer> vals = new ArrayList<>();
        Deque<Node> stack = new ArrayDeque<>();

        if (root == null) {
            return new ArrayList<>();
        }
        
        stack.push(root);

        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            vals.add(curr.val);

            if (curr.children != null) {
                Collections.reverse(curr.children);
                curr.children.forEach(c -> stack.push(c));
            }
        }

        return vals;
    }
}