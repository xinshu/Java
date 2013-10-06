import java.util.*;

public class cc0201{
	public ListNode rDLessSpace(ListNode head){
		if(head==null) return null;
		ListNode curr = head;
		while(curr!=null){
			ListNode ahead = curr;
			while(ahead!=null && ahead.next!=null){
				if(curr.val==ahead.next.val){
					ahead.next = ahead.next.next;
					//System.out.println(ahead.val);
				}
				ahead = ahead.next;
			}
			curr = curr.next;
		}
		return head;
	}
	
	public ListNode removeDuplicates(ListNode head){
		HashSet<Integer> set = new HashSet<Integer>();
		ListNode cur = head;
		ListNode pre = new ListNode(0);
		while(cur!=null){
			if(set.contains(cur.val)){
				pre.next = cur.next;
				pre = cur.next;
			}
			else{
				set.add(cur.val);
				pre.next = cur;
				pre = cur;
			}
			cur = cur.next;
		}
		return head;
	}

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		ListNode head = new ListNode(4);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(5);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(5);
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode chead = head;
		
		cc0201 test = new cc0201();
		//ListNode result = test.removeDuplicates(head);
		ListNode result = test.rDLessSpace(head);
		ListNode probe = head;
		while(probe!=null){
			System.out.print(probe.val + " ");
			probe = probe.next;
		}
		
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}