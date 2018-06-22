package Chapter2_Linkedlists;

public class LoopDetection {
	
	public Node loopDetection(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				break;
			}
		}
		
		if(fast == null || fast.next == null) {
			return null;
		}
		
		slow = head;
		while(slow!=fast) {
			slow = slow.next;
			fast = fast.next;
		}
		
		return fast;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopDetection ld = new LoopDetection();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(3);
		Node res = ld.loopDetection(head);
		System.out.println(res.val);
	}

}
