import java.util.*;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        if(head.next.next == null) {
            head.next.next = head;
            head = head.next;
            head.next.next = null;

            return head;
        }

        ListNode new_head = new ListNode(-1, head);
        ListNode first = new_head, second = head, third = head.next;
       
        while(third.next != null && third.next.next != null) {
            first.next = third;
            second.next = third.next;
            third.next = second;
            
            first = third;
            second = third.next;
            third = second.next;   
        }

        return new_head.next;
    }
}
