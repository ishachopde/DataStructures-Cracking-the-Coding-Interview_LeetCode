package Chapter2_Linkedlists;

import java.util.Stack;

public class Palindrome {
	
	Stack<Integer> s = new Stack<Integer>();
	
	public boolean isPalindrome(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast !=null && fast.next != null) {
			s.push(slow.val);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(fast !=null ) {
			slow = slow.next;
		}
		
		while(slow !=null) {
			if(s.pop() != slow.val) {
				return false;
			}
			slow = slow.next;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome p = new Palindrome();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(1);
		System.out.println(p.isPalindrome(head));
	}

}
