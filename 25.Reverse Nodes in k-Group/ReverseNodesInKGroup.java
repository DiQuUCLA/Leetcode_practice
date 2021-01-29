import java.util.*; 

class ReverseNodesInKGroup {
    public void reverseList(ListNode head, ListNode tail) {
        if(head == tail) {
            return;
        }

        ListNode prev = head, curr = head.next;
        while(prev != tail) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode new_head = new ListNode(-1, head);
        
        ListNode prev = new_head;
        while(prev.next != null and prev.next.next != null) {
            ListNode top = prev.next;
            ListNode tail = prev;
            int i = 0
            for(; i < k && tail.next != null; i++) {
                tail = tail.next;
            }
            ListNode next = tail.next;
            if (i == k) {
                reverseList(top, tail);
                prev.next = tail;
                top.next = next;
                prev = top;
            }else {
                break;
            }
        }
        return new_head.next;
    }
}
