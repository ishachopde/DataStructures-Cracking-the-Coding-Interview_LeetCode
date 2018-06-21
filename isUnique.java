package Chapter1_Arrays;

public class isUnique {

	boolean[] arr = new boolean[256];
	public boolean isunique(String s) {
		char[] c = s.toCharArray();
		for(char ele : c) {
			//arr[ele]++;

			if(arr[ele]) {
				return false;
			} 
			arr[ele]=true;
		}


		return true;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isUnique is = new isUnique();
		String s = "inAhkkopla";
		boolean result = is.isunique(s);
		System.out.println("result "+result);
	}

}
