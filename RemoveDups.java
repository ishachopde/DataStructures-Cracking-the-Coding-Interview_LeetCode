package Chapter2_Linkedlists;

import java.util.HashSet;


public class RemoveDups {

	HashSet<Integer> hs = new HashSet<Integer>();
	
	public void removeDups(Node head) {
		Node curr = head;
		Node prev = null;
		while(curr!=null) {
			if(hs.contains(curr.val)) {
				prev.next=curr.next;
			} else {
				hs.add(curr.val);
				prev = curr;
			}
			
			curr = curr.next;
			
		}
		
		while(head !=null) {
			System.out.println(head.val+" ");
			head = head.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDups rd = new RemoveDups();
		Node head = new Node(1);
		//System.out.println(head.val);
		head.next = new Node(2);
		head.next.next = new Node(2);
		head.next.next.next = new Node(1);
		head.next.next.next.next = new Node(3);
		head.next.next.next.next.next = new Node(5);
		rd.removeDups(head);
		//System.out.println(res.val);
	}

}
