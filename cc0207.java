import java.util.*;

public class cc0207{
	
	public boolean isPalindrome(ListNode head){
		ListNode copyhead = copy(head);
		ListNode rev = reverse(copyhead);
		return isSame(head, rev);
	}
	
	private boolean isSame(ListNode node1, ListNode node2){
		while(node1!=null && node2!=null){
			if(node1.val!=node2.val) return false;
			node1 = node1.next;
			node2 = node2.next;
		}
		if(node1==null ^ node2==null) return false;
		return true;
	}
	
	private ListNode copy(ListNode head){
		ListNode copyhead = new ListNode(0);
		ListNode copytail = copyhead;
		while(head!=null){
			copytail.next = new ListNode(head.val);
			copytail = copytail.next;
			head = head.next;
		}
		return copyhead.next;
	}
	
	private ListNode reverse(ListNode head){
		if(head==null || head.next==null) return head;
		ListNode curr = head.next;
		ListNode pre = head;
		pre.next = null;
		while(curr.next!=null){
			ListNode next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		curr.next = pre;
		return curr;
	}
	
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		ListNode head = new ListNode(4);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(5);
		ListNode n4 = new ListNode(2);
		ListNode n5 = new ListNode(1);
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		/****************************************
		//test circular linkedlist
		int cnt = 0;
		while(cnt<10){
			cnt++;
			System.out.print(head.val + " ");
			head = head.next;
		}
		*****************************************/ 
		cc0207 test = new cc0207();
		System.out.println(test.isPalindrome(head));
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}