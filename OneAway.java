package Chapter1_Arrays;

public class OneAway {

	public boolean oneAway(String a, String b) {
		if(Math.abs(a.length() - b.length()) >1) {
			return false;
		}
		
		int count = 0;
		
		String smaller = a.length() > b.length() ? b : a;
		String longer = a.length() <b.length() ? b : a;
		
		int i = 0;
		int j =0;
		while(i<longer.length() && j<smaller.length()){
			if(a.charAt(i) != b.charAt(j)) {
				count++;
				if(count != 1) {
					return false;
				}
				if(longer.length() == smaller.length()) {
					j++;
				}
			} else {
				j++;
			}
			i++;
		}
		
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneAway oa = new OneAway();
		String a = "pales";
		String b = "baes";
		System.out.println(oa.oneAway(a, b));
	}

}
