package leetcode;
/**
Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:
Given m, n satisfy the following condition:
1 ¡Ü m ¡Ü n ¡Ü length of list.
 * @author Evergeeen
 *
 */
public class Reverse_Linked_List_II {

	public ListNode reverseBetween(ListNode head, int m, int n) {
		return null ;
    }
	
	public static void main(String[] args) {
		ListNode head = null ;
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		
		head = n1 ;
		n1.next = n2;
		n2.next = n3 ;
		n3.next = n4 ; 
		n4.next = n5 ;
		int m = 2, n = 4 ;
		
		System.out.println(new Reverse_Linked_List_II().reverseBetween(head, m, n));
	}

}
