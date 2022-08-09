
public class P6ReverseLinkedList {
    
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode prev = head;
        ListNode curr = prev.next;
        
        head.next = null;
        
        while(prev != null && curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
}
