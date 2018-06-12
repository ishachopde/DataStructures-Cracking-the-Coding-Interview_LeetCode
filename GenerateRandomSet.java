//import java.util.Random;
public class GenerateRandomSet {

	public static int[] random(int array[], int n) {
		int subarray[] = new int[n];
		for(int i =0;i<n;i++) {
			subarray[i] = array[i];
		}

		for(int i =n;i<array.length;i++) {
			//int len = array.length-1;
			int r = rand(0,i);
			if(r<n) {
				subarray[r]=array[i];
			}

		}

		//System.out.println(subarray);
		return subarray;
	}

	public static int rand(int a, int b) {
		return (int) (a +(Math.random()*(b-a+1)));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,5,6,7};
		int[] result = random(array,4);
		for(int i =0;i<result.length;i++) {
			System.out.println("random set: "+result[i]);
		}
	}
}
