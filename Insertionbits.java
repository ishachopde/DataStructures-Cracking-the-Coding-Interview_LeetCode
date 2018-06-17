
public class InsertionBits {

	static int insert(int n, int m,int i, int j) {
		//clear bits between i and j
		int all = ~0;
		int lefthalf = all<<(j+1);
		System.out.println("lefthalf: "+lefthalf);
		
		int righthalf = (1<<i)-1;
		System.out.println("righthalf: "+righthalf);
		
		int mask = lefthalf | righthalf;
		int newnum = n & mask;
		System.out.println("newnum: "+newnum);
		int temp = m <<i;
		System.out.println("Temp: "+temp);
		
		return newnum | temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int result = insert(1024,19,2,6);
System.out.println(result);
	}

}
