package Chapter1_Arrays;

public class PalindromePermutation {

	public boolean palindromePermutation(String s) {
		if(s == null) return true;
		
		int[] arr = new int[128];
		
		char c[] = s.toCharArray();
		for(char ele : c) {
			arr[ele]++;
		}
		
		int count = 0;
		for(int i=0;i<arr.length&& count<=1;i++) {
			count += arr[i]%2;
		}
		
		if(count>1) {
			return false;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromePermutation pp = new PalindromePermutation();
		String s = "tactcoa";
	
		boolean res = pp.palindromePermutation(s);
		System.out.println(res);
	}

}
