import java.util.*;

public class cc0202{
	public ListNode findKthF(ListNode head, int k){
		ListNode l1 = head, l2 = head;
		int cnt = 0;
		while(l1!=null && cnt<=k){
			l1 = l1.next;
			cnt++;
		}
		while(l1!=null){
			l1 = l1.next;
			l2 = l2.next;
		}
		System.out.println(l2.val);
		return l2;
	}
	public int findKthR(ListNode head, int k){
		if(head==null) return -1;
		int i = findKthR(head.next, k) + 1;
		if(i==k)
			System.out.println(head.val);
		return i;
	}
	public ListNode findKthlast(ListNode head, int k){
		if(head==null) return null;
		int cnt = 0;
		ListNode probe = head;
		while(probe!=null){
			cnt++;
			probe = probe.next;
		}
		//System.out.println(cnt);
		if(k>=cnt) return null;
		probe = head;
		int i = 0;
		while(i<cnt-k-1){
			i++;
			probe = probe.next;
		}
		return probe;
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
		
		cc0202 test = new cc0202();
		/*ListNode res = test.findKthlast(head, 5);
		if(res==null) System.out.println("null");
		else System.out.println(res.val);*/
		test.findKthF(head, 3);
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}