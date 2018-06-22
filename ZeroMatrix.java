package Chapter1_Arrays;

public class ZeroMatrix {

	public void zeroMatrix(int[][] mat) {
		boolean rowhaszero = false;
		boolean colhaszero = false;
		
		// first col has zero or not
		for(int r =0;r<mat.length;r++) {
			if(mat[r][0] == 0) {
				colhaszero = true;
			}
		}
		
		// irst row has zero or not
		for(int c =0; c<mat[0].length;c++) {
			if(mat[0][c] == 0) {
				rowhaszero = true;
			}
		}
		for(int r=1;r<mat.length;r++) {
			for(int c =1;c<mat[0].length;c++) {
				if(mat[r][c]==0) {
					mat[0][c]=0;
					mat[r][0]=0;
				}
			}
		}
		
		for(int r =1;r<mat.length;r++) {
			if(mat[r][0]==0) {
				nullifyrow(mat,r);
			}
		}
		
		for(int c=1;c<mat[0].length;c++) {
			if(mat[0][c]==0) {
				nullifycol(mat,c);
			}
		}
		
		if(rowhaszero) {
			nullifyrow(mat,0);
		}
		
		if(colhaszero) {
			nullifycol(mat,0);
		}
		
		for(int r=0;r<mat.length;r++) {
			for(int c=0;c<mat[0].length;c++) {
				System.out.print(mat[r][c]);
			}
			System.out.println();
		}
		
	}
	
	public void nullifyrow(int[][] mat, int r) {
		for(int c =0;c<mat[0].length;c++) {
			mat[r][c]=0;
		}
	}
	
	public void nullifycol(int[][] mat, int c) {
		for(int r=0;r<mat.length;r++) {
			mat[r][c]=0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZeroMatrix zm = new  ZeroMatrix();
		int[][] mat = {{1,0,1,1},{1,1,1,1},{1,1,1,1}};
		zm.zeroMatrix(mat);
	}

}
