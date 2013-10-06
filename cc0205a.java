import java.util.*;

public class cc0205a{
	public ListNode add(ListNode node1, ListNode node2){
		ListNode reversen1 = reverse(node1);
		ListNode reversen2 = reverse(node2);
		ListNode reverseresult = reverseadd(reversen1, reversen2);
		return reverse(reverseresult);
	}
	
	public ListNode reverseadd(ListNode node1, ListNode node2){
		if(node1==null && node2==null) return null;
		int carrier = 0;
		ListNode res = new ListNode(0);
		ListNode rest = res;
		while(node1!=null && node2!=null){
			carrier += (node1.val+node2.val);
			rest.next = new ListNode(carrier%10);
			carrier /= 10;
			rest = rest.next;
			node1 = node1.next;
			node2 = node2.next;
		}
		ListNode tmp = null;
		if(node1==null && node2!=null){
			tmp = node2;
		}
		else if(node1!=null && node2==null){
			tmp = node1;
		}
		else if(node1==null && node2==null){
			tmp = new ListNode(0);
		}
		while(tmp!=null){
			carrier += tmp.val;
			if(carrier==0 && tmp.next==null) break;
			rest.next = new ListNode(carrier%10);
			carrier /= 10;
			rest = rest.next;
			tmp = tmp.next;
		}
		return res.next;
	}
	
	private ListNode reverse(ListNode node){
		if(node==null) return null;
		if(node.next==null) return node;
		ListNode pre = node;
		ListNode curr = pre.next;
		pre.next = null;
		while(curr.next!=null){
			//back up
			ListNode next = curr.next;
			//reset
			curr.next = pre;
			//update
			pre = curr;
			curr = next;
		}
		curr.next = pre;
		return curr;
	}
	
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		ListNode n11 = new ListNode(7);
		ListNode n12 = new ListNode(1);
		ListNode n13 = new ListNode(6);
		n11.next = n12; n12.next = n13;
		
		ListNode n21 = new ListNode(5);
		ListNode n22 = new ListNode(9);
		//ListNode n23 = new ListNode(3);
		n21.next = n22; 
		//n22.next = n23;
		
		cc0205a test = new cc0205a();
		ListNode result = test.add(n11, n21);
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