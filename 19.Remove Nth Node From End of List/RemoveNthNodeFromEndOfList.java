import java.util.*;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode traverse = head;
        while(n > 0 && traverse != null)
        {
            traverse = traverse.next;
            n--;
        }

        ListNode newhead = new ListNode(-1, head);

        ListNode prev = newhead, temp = head;
        if(traverse == null)
        {
            return head.next;
        }

        while(traverse != null)
        {
            prev = temp;
            temp = temp.next;
            traverse = traverse.next;
        }

        prev.next = temp.next;
        return newhead.next;
    }
}
