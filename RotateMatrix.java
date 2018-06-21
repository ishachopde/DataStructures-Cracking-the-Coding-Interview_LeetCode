package Chapter1_Arrays;

public class RotateMatrix {
	
	public static void rotateMatrix(int mat[][]){
		for(int r=0;r<mat.length;r++) {
			for(int c=0;c<r;c++) {
				int temp = mat[r][c];
				mat[r][c] = mat[c][r];
				mat[c][r] = temp;
			}
		}
		
		
		for(int r=0;r<mat.length;r++) {
			for(int c =0;c<mat[0].length/2;c++) {
				int temp = mat[r][mat[0].length-1];
				mat[r][mat[0].length-1] = mat[r][c];
				mat[r][c]=temp;
			}
		}
		for(int r =0; r<mat.length;r++) {
			for(int c=0;c<mat[0].length;c++) {
				System.out.print(mat[r][c]);
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		rotateMatrix(mat);
	}

}
