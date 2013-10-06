/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class test0903 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode list = new ListNode(0);
		list.next = head;
		int cnt = 1;
		ListNode prehead = list, subhead = list, cur = list;
		while(cnt<m){
			prehead = prehead.next;
			cnt++;
		}
		subhead = prehead.next;
		cur = subhead.next;
		cnt++;//1 greater than m
		while(cnt<=n){
			subhead.next = cur.next;
			cur.next = prehead.next;
			prehead.next = cur;
			cur = subhead.next;
			cnt++;
		}
        return list.next;
    }
	
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode chead = head;
		while(chead!=null){
			System.out.print(chead.val + " -> ");
			chead = chead.next;
		}
		System.out.print("null");
		System.out.println();
		
		test0903 test = new test0903();
		ListNode result = test.reverseBetween(head, 2, 4);
		while(result!=null){
			System.out.print(result.val + " -> ");
			result = result.next;
		}
		System.out.print("null");
		System.out.println();
	}
}