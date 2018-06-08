
public class ContiguousSequence {

	public static int getMaxSum(int[] arr) {
		int maxsum = 0;
		int sum =0;
		for(int i =0;i<arr.length;i++) {
			sum = sum +arr[i];
			if(sum>maxsum) {
				maxsum = sum;
			} else if(sum<0) {
				sum = 0;
			}
		}
		
		return maxsum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[] = {2, -8, 3, -5, 4, -10};
int result = getMaxSum(array);
System.out.println("Max sum is: "+result);
	}

}


