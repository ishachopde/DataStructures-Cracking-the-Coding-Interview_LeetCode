class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList<Integer>result = new ArrayList<Integer>();
        
         if(matrix.length == 0){
            return result;
        }
        
        int i;
        int rowB = 0;
        int rowE = matrix.length-1;
       // System.out.println(rowE);
        int colB = 0;
        int colE = matrix[0].length-1;
       // System.out.println(colE);
        
       
        
        //traverse through the matrix[][]
        while(rowB<=rowE && colB<=colE){
            //traverse right in rowB
        for(i=colB;i<=colE;i++){
            result.add(matrix[rowB][i]);
            //System.out.println(result);
        }
        rowB++;
            //traverse down in colE
        for(i=rowB;i<=rowE;i++){
            result.add(matrix[i][colE]);
        }
        colE--;
            
            //traverse left in rowE
        if(rowB<=rowE){
                     // we also check that rowB is <= rowE to avoid duplicate rows and columns
            for(i=colE;i>=colB;i--){
                result.add(matrix[rowE][i]);
            }
        }
        rowE--;
            
            //traverse up in colB
        if(colB<=colE){
            for(i=rowE;i>=rowB;i--){
                result.add(matrix[i][colB]);
            }
        } 
       colB++;
        }
        
        
        
        return result;
    }
}