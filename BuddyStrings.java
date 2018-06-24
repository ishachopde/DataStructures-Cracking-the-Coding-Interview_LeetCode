
public class BuddyStrings {

	public static boolean buddyStrings(String s, String t) {
		if(s.length() != t.length() || s ==  null || t == null) {
			return false;
		}
		
		int count = 0;
		int prev =-1,curr =-1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i) != t.charAt(i)) {
				count++;
				if(count>2) {
					return false;
			}
				prev = curr;
				curr =i;
			} else if(s.charAt(i) == t.charAt(i) && s.charAt(i) != t.charAt(i+1) && s.charAt(i+1) != t.charAt(i) && s.charAt(i+1) == t.charAt(i+1)) {
				return false;
			}	
		}	
		return true ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabc";
		String t = "aaabc";
		boolean result = buddyStrings(s,t);
		System.out.println(result);
	}

}
