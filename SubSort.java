import java.util.ArrayList;

public class SubSort {

	public static void getSubSortIndex(int[] array) {
		int endleft = endOfLeft(array); //find left subsequence
		
		if(endleft>=array.length-1) return;
		
		
		int startright = startOfRight(array);
		int max = endleft;
		int min = startright;
		for(int i = endleft+1;i<startright;i++) {
			if(array[i]>array[max]) max = i;
			if(array[i]<array[min]) min =i;
		}
		
		
		int left = shrinkLeft(array, min,endleft);
		int right = shrinkRight(array, max, startright);
		System.out.println("Min index: "+left+" Max index: "+right);
		
	}
	
	static int endOfLeft(int[] array) {
		for(int i = 1;i<array.length;i++) {
			if(array[i]<array[i-1]) {
				return i-1;
			}
		}
		return array.length-1;
	}
	
	
	static int startOfRight(int[] array) {
		for(int i =array.length-2;i>=0;i--) {
			if(array[i]>array[i+1]) {
				return i+1;
			}
		}
		return 0;
	}
	
	static int shrinkLeft(int[]array, int min,int endleft) {
		//int temp = array[min];
		for(int i = endleft-1;i>=0;i--) {
			if(array[i]<=array[min]) return i+1;
		}
		return 0;
	}
	
	static int shrinkRight(int[]array, int max,int startright) {
		//int temp = array[min];
		for(int i = startright;i<array.length;i++) {
			if(array[i]>=array[max]) return i-1;
		}
		return array.length-1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,4,7,10,11,8,12,5,6,16,18,19};
		getSubSortIndex(array);
		
	}

}
