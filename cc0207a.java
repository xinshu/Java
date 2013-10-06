import java.util.*;

public class cc0207a{
	
	public boolean isPalindrome(ListNode head){
		if(head==null || head.next==null) return true;
		Stack<Integer> firsthalf = new Stack<Integer>();
		ListNode slow = head;
		ListNode fast = head;
		boolean odd = false;
		while(fast!=null){
			firsthalf.push(slow.val);
			slow = slow.next;
			if(fast.next==null){
				odd = true;
				fast = null;
			}
			else if(fast.next.next==null){
				odd = false;
				fast = null;
			}
			else{
				fast = fast.next.next;
			}
		}
		if(odd) firsthalf.pop();
		while(!firsthalf.isEmpty()){
			int tmp = firsthalf.pop();
			if(tmp!=slow.val) return false;
			slow = slow.next;
		}
		return true;
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
		
		cc0207a test = new cc0207a();
		System.out.println(test.isPalindrome(head));
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}