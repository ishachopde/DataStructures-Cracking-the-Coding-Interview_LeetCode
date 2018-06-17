
public class BinaryString {

	static String binaryString(double d) {
		StringBuilder result = new StringBuilder();
		result.append(".");
		while(d>0) {
			double r = d*2;
			if(r>=1) {
				result.append("1");
				d = r-1;
			} else {
				result.append("0");
				d = r;
			}
			
		}
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r = binaryString(0.725);
		System.out.println(r);
		
	}

}
