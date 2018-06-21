package Chapter1_Arrays;

public class CheckPermutation {

	int[] arr = new int[128];
	
	public boolean checkPermutation(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		
		char a1[] = a.toCharArray();
		for(char e : a1) {
			arr[e]++;
		}
		
		char b1[] = b.toCharArray();
		for(char f : b1) {
			arr[f]--;
			if(arr[f]<0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPermutation cp = new CheckPermutation();
		String a = "aabbccdd";
		String b ="bbccaaddtgh";
		boolean res = cp.checkPermutation(a, b);
		System.out.println(res);
	}

}
