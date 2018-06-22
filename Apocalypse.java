package Chapter6_MathLogicPuzzles;

import java.util.Random;

public class TheApocalypse {
	public static double genderRatio(int num) {
		int girls = 0;
		int boys = 0;
		
		for(int i =0;i<num;i++) {
			int[] genders = runFamily();
			girls +=genders[0];
			boys += genders[1];
		}
		
		return girls/ (double) (boys+girls);
	}
	
	public static int[] runFamily() {
		Random ran = new Random();
		int girls =0;
		int boys = 0;
		
		while(girls ==0) {
			if(ran.nextBoolean()) {
				girls += 1;
			}else {
				boys += 1;
			}
		}
		int[] genders = {girls,boys};
		return genders;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10000;
		System.out.println(genderRatio(n));
	}

}
