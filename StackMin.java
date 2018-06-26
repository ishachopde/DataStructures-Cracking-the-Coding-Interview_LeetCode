package Chapter3_StacksQueues;
import java.util.Stack;

public class StackMin {
	Stack<Integer> allvaluestack = new Stack<Integer>();
	Stack<Integer> minvalues = new Stack<Integer>();
	int min = Integer.MAX_VALUE;

	public void push(int num) {
		allvaluestack.push(num);
		if(num < min) {
			minvalues.push(num);
			min = num;
		}
		System.out.println("The top element is "+num+" and the min element is "+min);
	}

	public int pop() {
		int temp = 0;
		if(!allvaluestack.isEmpty()) {
			temp = allvaluestack.pop();
		}
		if(temp == min) {
			minvalues.pop();
		}
		return temp;

	}

	public int minElement() {
		int minelement = minvalues.peek();
		return minelement;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackMin sm = new StackMin();
		sm.push(3);
		sm.push(6);
		sm.push(2);
		int result = sm.minElement();
		System.out.println("min element is "+result);
		System.out.println("element popped is "+sm.pop());
		int result1 = sm.minElement();
		System.out.println("min element is "+result1);

	}

}
