import java.util.*;

public class cc0206a{
	public ListNode prehead(ListNode head){
		if(head==null) return null;
		ListNode next = head.next;
		ListNode prenext = head; //the node pointed to next;
		while(next!=head){
			prenext = next;
			next = next.next;
		}
		return prenext;
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
		n5.next = head;
		
		/****************************************
		//test circular linkedlist
		int cnt = 0;
		while(cnt<10){
			cnt++;
			System.out.print(head.val + " ");
			head = head.next;
		}
		*****************************************/
		
		cc0206a test = new cc0206a();
		ListNode result = test.prehead(head);
		//1
		System.out.print(result.val);
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}