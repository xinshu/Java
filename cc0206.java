import java.util.*;

public class cc0206{
	public ListNode findBeginning(ListNode head){
		if(head==null) return null;
		ListNode slow = head, fast = head;
		ListNode preslow = null;
		int slowstepcnt = 0;
		//not necessary, useful for count loopsize
		//int faststepcnt = 0;
		while(slowstepcnt==0 || slow!=fast){
			slowstepcnt++;
			preslow = slow; // the node before the going current slow
			slow = slow.next;
			if(slow==null) return null;
			fast = fast.next;
			if(fast==null) return null;
			fast = fast.next;
			if(fast==null) return null;
			/******************** altinative
			if(slow.next==null) return null;
			slow = slow.next;
			if(fast.next==null || fast.next.next==null) return null;
			fast = fast.next.next;
			*********************/
		}
		return preslow;
	}

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		ListNode head = new ListNode(4);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(5);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(1);
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n3;
		
		/****************************************
		//test circular linkedlist
		int cnt = 0;
		while(cnt<10){
			cnt++;
			System.out.print(head.val + " ");
			head = head.next;
		}
		*****************************************/
		
		cc0206 test = new cc0206();
		ListNode result = test.findBeginning(head);
		//5
		System.out.print(result.val);
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}