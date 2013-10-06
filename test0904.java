import java.util.*;

public class test0904{
	public ListNode mergeKLists(ArrayList<ListNode> lists) {
		if(lists==null || lists.isEmpty()) return null;
		
		Comparator<ListNode> comparator = new Comparator<ListNode>(){
			@Override
			public int compare(ListNode l1, ListNode l2){
				if(l1.val<l2.val) return -1;
				else if(l1.val>l2.val) return 1;
				else return 0;
			}
		};
		
		ListNode head = null;
		ListNode curr = null;
		PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(lists.size(), comparator);
		
		for(int i=0; i<lists.size(); i++){
			if(lists.get(i)!=null)
				heap.add(lists.get(i));
		}
		
		while(!heap.isEmpty()){
			if(head==null){
				head = heap.poll();
				curr = head;
				if(curr.next!=null){
					heap.add(curr.next);
				}
			}
			else{
				curr.next = heap.poll();
				curr = curr.next;
				if(curr.next!=null)
					heap.add(curr.next);
			}
		}
		return head;
	}
	
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		ListNode head = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ArrayList<ListNode> list = new ArrayList<ListNode>();
		list.add(head);
		list.add(head1);
		list.add(head2);
		/*for(int i=0; i<list.size(); i++){
			ListNode result = list.get(i);
			while(result!=null){
				System.out.print(result.val + " -> ");
				result = result.next;
			}
			System.out.print("null");
			System.out.println();
		}*/
		ListNode result = null;
		test0904 test = new test0904();
		result = test.mergeKLists(list);
		while(result!=null){
			System.out.print(result.val + " -> ");
			result = result.next;
		}
		System.out.print("null");
		System.out.println();
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}