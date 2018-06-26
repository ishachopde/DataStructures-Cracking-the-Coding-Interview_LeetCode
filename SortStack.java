package Chapter3_StacksQueues;
import java.util.Stack;

public class SortStack {
	
	Stack<Integer> s2 = new Stack<Integer>();
	
	public Stack<Integer> sortStack(Stack<Integer> s) {
		while(!s.isEmpty()) {
			int temp = s.pop();
			while(!s2.isEmpty() && temp > s2.peek()) {
				s.push(s2.pop());
			}
			s2.push(temp);
		}
		return s2;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortStack ss = new SortStack();
		Stack<Integer> s = new Stack<Integer>();
		s.add(2);
		s.add(1);
		s.add(9);
		s.add(5);
		s.add(3);
		Stack<Integer> res = ss.sortStack(s);
		while(!res.isEmpty()) {
			System.out.println(res.pop());
		}
	}

}
