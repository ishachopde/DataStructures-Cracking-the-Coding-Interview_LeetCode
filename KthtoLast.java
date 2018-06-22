package Chapter2_Linkedlists;

public class KthtoLast {
	
	Node slow;
	Node fast;
	public Node kthLast(Node head, int k) {
		slow = head;
		fast = head;
		for(int i=0;i<k;i++) {
			fast = fast.next;
		}
		
		while(fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthtoLast kln = new KthtoLast();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		int k =2;
		Node res = kln.kthLast(head, 1);
		System.out.println(res.val);
	}

}
