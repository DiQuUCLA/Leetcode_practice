import java.util.*;

class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode();
        ListNode tail = head;
        int num_nodes = lists.length;
        if(num_nodes == 0) {
            return head.next;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(num_nodes,new Comparator<ListNode>(){
            @Override
            public int compare(ListNode o1,ListNode o2){
                if (o1.val<o2.val)
                    return -1;
                else if (o1.val==o2.val)
                    return 0;
                else 
                    return 1;
            }
        });
        
        for (ListNode l : lists) {
            if(l != null){
                pq.add(l);
            }
        }
        
        while(!pq.isEmpty()) {
            ListNode t = pq.poll();
            if(t.next != null){
                pq.add(t.next);
            }

            tail.next = t;
            tail = tail.next;
        }

        return head.next;
    }
}
