import java.util.*;

// dependent myIterator.java
public class test0910a{
	private ListNode createLinkedList(int[] listarr){
		ListNode prehead = new ListNode(0);
		ListNode head = prehead;
		for(int i=0; i<listarr.length; i++){
			head.next = new ListNode(listarr[i]);
			head = head.next;
		}
		return prehead.next;
	}
	
	private class ListNode implements myIterator<ListNode>{
		public boolean hasNext(){
			if(next!=null) return true;
			else return false;
		}
		public ListNode next(){
			return next;
		}
		public void remove(){}
	}
	
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		int[] listarr = {1,4,8,4,6,7,5,3};
		ListNode head = null;
		test0910a test = new test0910a();
		head = test.createLinkedList(listarr);
		while(head!=null){
			System.out.print(head.val + " ");
			head = head.next;
		}
	
		System.out.println();
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}