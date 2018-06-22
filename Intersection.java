package Chapter2_Linkedlists;

public class Intersection {
	
	public Node intersectionPoint(Node headA, Node headB) {
		//Node a = headA;
		//Node b = headB;
		int aList = sizeLinkedList(headA);
		//System.out.println("aList:"+aList);
		int bList = sizeLinkedList(headB);
		int diff = Math.abs(aList - bList);
		
		while(aList>bList) {
			headA= headA.next;
			aList--;
		}
		
		while(bList>aList) {
			headB = headB.next;
			bList--;
		}
		
		while(headA != headA) {
			headA = headA.next;
			headB = headB.next;
		}
		return headB;
	}
	
	public int sizeLinkedList(Node head) {
		int count =0;
		while(head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intersection i = new Intersection();
		Node headA = new Node(1);
		headA.next = new Node(2);
		headA.next.next = new Node(5);
		headA.next.next.next = new Node(3);
		
		Node headB = new Node(5);
		headB.next = new Node(3);
		Node res = i.intersectionPoint(headA, headB);
		System.out.println(res.val);
		
	}

}
