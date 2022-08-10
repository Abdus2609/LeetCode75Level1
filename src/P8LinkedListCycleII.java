import java.util.ArrayList;
import java.util.List;

public class P8LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {

        List<ListNode> vals = new ArrayList<>();
        ListNode curr = head;
        
        while (curr != null) {
            if (vals.contains(curr)) {
                return curr;
            }
            
            vals.add(curr);
            curr = curr.next;
        }

        return null;
    }
}