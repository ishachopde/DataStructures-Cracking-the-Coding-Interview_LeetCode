
public class AddNumbersWithoutPlus {

	public static int add(int a,int b) {
		if(a==0) return b;
		if(b==0) return a;
		
		int sum = a^b;
		int carry = (a&b)<<1;
		return add(sum,carry);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 17;
		int b= 12;
		int result = add(a,b);
		System.out.println("addition: "+result);
	}

}
