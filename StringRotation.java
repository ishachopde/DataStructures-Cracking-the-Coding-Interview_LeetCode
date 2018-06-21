package Chapter1_Arrays;

public class StringRotation {

	
	public boolean isRotation(String a, String b) {
		if(a.length() == b.length() && a.length()>0) {
			String s =a+a;
			return isSubstring(s,b);
			
		}
		
		return false;
	}
	
	public boolean isSubstring(String n, String m) {
		if(n.contains(m)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRotation sr= new StringRotation();
		String a ="waterbottle";
		String b ="erbottlewat";
		
		boolean res = sr.isRotation(a, b);
		System.out.println(res);
	}

}
