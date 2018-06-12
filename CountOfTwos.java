
public class CountOfTwos {

	public static int CountofTwos(int num) {
		int count =0;
		for(int i =0;i<=num; i++) {
			count = count + numberTwo(i);
		}
		return count;
	}

	public static int numberTwo(int n) {
		int count = 0;
		while(n>0) {
			if(n%10 == 2) {
				count++;
			}
			n = n/10;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int result = CountofTwos(n);
		System.out.println("count of 2:"+result);
	}

}
