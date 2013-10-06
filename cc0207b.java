import java.util.*;

public class cc0207b{
	
	public boolean isPalindrome(ListNode head){
		
	}
	
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		ListNode head = new ListNode(4);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(5);
		ListNode n4 = new ListNode(2);
		ListNode n5 = new ListNode(4);
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		cc0207b test = new cc0207b();
		//System.out.println(test.isPalindrome(head));
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}