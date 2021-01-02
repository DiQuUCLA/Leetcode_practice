import java.util.*;

public class ListNode {
	int val;
	ListNode next;
	
	public LLNode(int val)
	{
		this.val = val;
	}
}

public class Add_Two_Numbers
{
	public ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		ListNode traverse1, traverse2, prev1, prev2;
        prev1 = null;
        prev2 = null;
		traverse1 = l1;
		traverse2 = l2;

		if(l1 == null)
		{
			return l2;
		}else if(l2 == null)
		{
			return l1;
		}

		int carry = 0;
		while(traverse1 != null && traverse2 != null)
		{
			int sum = traverse1.val + traverse2.val + carry;
			traverse1.val = sum % 10;
			carry = sum / 10;

			prev1 = traverse1;
			prev2 = traverse2;
			traverse1 = traverse1.next;
			traverse2 = traverse2.next;
		}

		if(traverse1 == null && traverse2 == null)
		{
			if(carry == 1)
			{
				prev1.next = new ListNode(1);
			}
			return l1;
		}

		if(traverse1 == null)
		{
			prev1.next = traverse2;
			traverse1 = prev1.next;
		}

		while(traverse1!= null && carry == 1)
		{
			traverse1.val = (traverse1.val + 1) % 10;
			if(traverse1.val > 0)
			{
				carry = 0;
			}

			prev1 = traverse1;
			traverse1 = traverse1.next;
		}

		if(carry == 1)
		{
			prev1.next = new ListNode(1);
		}

		return l1;
	}
}
