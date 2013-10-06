import java.util.*;

public class cc0204{
	public ListNode partition(ListNode head, int x){
		ListNode less = new ListNode(0);
		ListNode greater = new ListNode(0);
		ListNode lesstail = less, greatertail = greater;
		ListNode curr = head;
		while(curr!=null){
			ListNode next = curr.next; //pay attention
			if(curr.val<x){
				lesstail.next = curr;
				lesstail = curr;
			}
			else{
				greatertail.next = curr;
				greatertail = curr;
				//greatertail.next = null; //alternative
			}
			curr = next;
		}
		greatertail.next = null; //avoid an infinity linkedlist
		lesstail.next = greater.next;
		return less.next;
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
		
		cc0204 test = new cc0204();
		ListNode result = test.partition(head, 3);
		//2 4 5 3 6
		while(result!=null){
			System.out.print(result.val + " ");
			result = result.next;
		}
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}