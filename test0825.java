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

import java.util.*;

public class test0825{
	public ListNode rotateRight(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int num=1, cnt=1;
		ListNode mark = null, end = null;
		ListNode headhelper = head;
		if(head==null || n==0) return head;
		while(headhelper.next!=null){
			num++;
			headhelper = headhelper.next;
		}
		end = headhelper;
		if(n%num==0) return head;
		ListNode headhelper1 = head;
		while(headhelper1.next!=null){
			cnt++;
			if(cnt==num-n%num){
				mark = headhelper1.next; 
				break;
			}
			headhelper1 = headhelper1.next;
		}
		ListNode newhead = mark.next;
		mark.next = null;
		end.next = head;
		
		return newhead;
    }
	
	public static void main(String[] args){
		//build linked list
		ListNode head = new ListNode(0);
		ListNode thead = head;
		for(int i=1; i<6; i++){
			thead.next = new ListNode(i);
			thead = thead.next;
		}
		ListNode newthead = head;
		
		//print original linked list
		while(newthead!=null){
			System.out.print(newthead.val + " ");
			newthead = newthead.next;
		}
		System.out.println();
		
		//rotate linked list
		test0825 test = new test0825();
		ListNode result = test.rotateRight(head, 2);
		//print rotated linked list
		while(result!=null){
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
}