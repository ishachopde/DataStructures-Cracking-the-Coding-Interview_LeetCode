package Chapter3_StacksQueues;

public class ThreeInOne {
	int tops[]; // to store indexes of tops of the 3 stacks
	int[] arr; 
	int stackcapacity;
	
	ThreeInOne(int sizeofstack, int sizeoftop){
		stackcapacity = sizeofstack;
		tops = new int[sizeoftop];
		arr = new int[stackcapacity*sizeoftop];
	}
	
	public void push(int num, int stacknum) {
		if(!isFull(stacknum)) {
			tops[stacknum]++;
			int index = getIndex(stacknum);
			arr[index] = num;
			System.out.println("Value "+num+" is at index "+index+" in arr");
		} else {
			System.out.println("Overflow !!!");
		}
		
	}
	
	public int pop(int stacknum) {
		int temp =0;
		if(!isEmpty(stacknum)) {
			int index = getIndex(stacknum);
			temp = arr[index];
			tops[stacknum]--;
		}
		return temp;
	}
	
	public boolean isFull(int stacknum) {
		if(tops[stacknum] == stackcapacity) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty(int stacknum) {
		if(tops[stacknum]==0) {
			return true;
		}
		return false;
	}
	
	public int getIndex(int stacknum) {
		return (stacknum*stackcapacity) + tops[stacknum]-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeInOne tin = new ThreeInOne(3,3);
		tin.push(5, 1);
		tin.push(3, 1);
		tin.push(2, 0);
		tin.push(1, 0);
		tin.push(9, 0);
		tin.push(8, 0);
		System.out.println("the value "+tin.pop(1)+" removed");
		System.out.println("the value "+tin.pop(0)+" removed");
	}

}
