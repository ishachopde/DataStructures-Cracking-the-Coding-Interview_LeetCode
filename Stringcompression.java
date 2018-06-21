package Chapter1_Arrays;

public class StringCompression {
	
	StringBuilder res = new StringBuilder();
	int count = 0;
	
	public String stringCompress(String s) {
		
		for(int i=0;i<s.length();i++) {
			count++;
			if((i+1) >=s.length() || s.charAt(i) != s.charAt(i+1)) {
				res.append(s.charAt(i));
				res.append(count);
				count = 0;
			} 
		}
		
		return res.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompression sc = new StringCompression();
		String s = "aabcccccaaa";
		System.out.println(sc.stringCompress(s));
	}

}
