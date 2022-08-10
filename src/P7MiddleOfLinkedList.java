public class P7MiddleOfLinkedList {

    public static ListNode middleNode(ListNode head) {

        int count = 0;
        ListNode curr = head;

        while (curr.next != null) {
            count++;
            curr = curr.next;
        }

        int midIndex = count % 2 == 1 ? (count / 2) + 1 : (count / 2);
        curr = head;

        for (int i = 0; i < midIndex; i++) {
            curr = curr.next;
        }

        return curr;
    }
}