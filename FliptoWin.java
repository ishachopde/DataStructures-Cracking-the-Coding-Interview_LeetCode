
public class FliptoWin {
	
static int flip(int a) {
	if(~a == 0) return Integer.BYTES *8;
	
	int len = 1;
	int cur = 0;
	int prev =0;
	while(a!=0) {
		if((a&1) == 1) {
			cur++;
		} else if((a&1)==0) {
			prev = (a&2) == 0? 0: cur;
			cur =0;
		}
		len = Math.max(prev+cur+1, len);
		a >>>= 1;
	}
	//System.out.println("len:"+len);
	return len;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int result = flip(5);
System.out.println(result);
	}

}
