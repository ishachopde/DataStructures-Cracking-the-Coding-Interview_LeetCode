package Chapter3_StacksQueues;
import java.util.Stack;

public class QueueViaStacks {
	Stack<Integer> s = new Stack<Integer>();
	Stack<Integer> t = new Stack<Integer>();

	public void enQueue(int num) {
		s.push(num);
		if(t.isEmpty()) {
			ifStackisEmpty();
		}
		System.out.println("Element pushed in stack s is "+num);
	}

	public int pop() {
		int temp =0;
		if(!t.isEmpty()) {
			temp = t.pop();
		}else {
			ifStackisEmpty();
			temp = t.pop();
		}
		return temp;
	}
	
	public void ifStackisEmpty() {
		while(!s.isEmpty()) {
			t.push(s.pop());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueViaStacks qvs = new QueueViaStacks();
		qvs.enQueue(1);
		qvs.enQueue(2);
		System.out.println("Element popped is "+qvs.pop());
		qvs.enQueue(3);
		qvs.enQueue(4);
		qvs.enQueue(5);
		qvs.enQueue(6);
		System.out.println("Element popped is "+qvs.pop());
		System.out.println("Element popped is "+qvs.pop());
		System.out.println("Element popped is "+qvs.pop());
	}

}
