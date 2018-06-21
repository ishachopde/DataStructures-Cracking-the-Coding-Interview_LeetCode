public class Urlify {

	public char[] urlify(char c[], int n) {
		
		
		int count = 0;
		
		for(int i=0;i<n;i++) {
			if(c[i] == ' ') {
				count++;
			}
		}
		
		int newlen = n-1+(count*3);
		System.out.println(newlen);
		
		if(n<c.length) {
			c[n]='\0';
		}
		
		for(int i=n-1; i>=0;i--) {
			if(c[i] == ' ') {
				c[newlen-1] = '0';
				c[newlen-2] = '2';
				c[newlen-3] = '%';
				newlen = newlen-3;
			} else {
				c[newlen-1] = c[i]; 
				newlen--;
			}
		}
		
		return c;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Urlify u = new Urlify();
		char[] s = {'i','s',' ','h','a'};
		int n = 5;
		char[] res = u.urlify(s, n);
		System.out.println(res);
	}

}
