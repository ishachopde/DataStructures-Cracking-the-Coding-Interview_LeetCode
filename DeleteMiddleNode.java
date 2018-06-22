package Chapter2_Linkedlists;

public class DeleteMiddleNode {
	public void deleteMiddle(Node n) {
		Node next = n.next;
		n.val = next.val;
		n.next = next.next;
		//n=n.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteMiddleNode dmn = new DeleteMiddleNode();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		Node n = head.next.next.next;
		dmn.deleteMiddle(n);
		
		while(head != null) {
			System.out.println(head.val+" ");
			head = head.next;
		}
	}

}
