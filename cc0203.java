import java.util.*;

public class cc0203{
	public void deleteinside(ListNode mid){
		mid.val = mid.next.val;
		mid.next = mid.next.next;
	}

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		ListNode head = new ListNode(4);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(5);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(6);
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		cc0203 test = new cc0203();
		test.deleteinside(n3);
		//4 2 3 6
		while(head!=null){
			System.out.print(head.val + " ");
			head = head.next;
		}
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}