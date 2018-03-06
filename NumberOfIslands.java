class Solution {
    private int row;
        private int col;
    
    public int numIslands(char[][] grid) {
       
        
        int islands=0;
        // number of islands are initially 0
        //simply traverse the rows and cols dfs wise. if u get a '1' which is a piece of land, just look for adjacent 1.
        row=grid.length;
        
        if(row==0){
            return 0;
        }
        
        col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    explore(grid, i,j);
                    ++islands;
                    //System.out.println(islands);
                }
            }
        }
         return islands;
        
    }
    
    private void explore(char[][] grid, int i, int j){
        
        if(i<0 || j<0 || i>=row || j>=col || grid[i][j] != '1' ){return;}
       
        grid[i][j]='0'; // it means that node is visited
        explore(grid, i+1,j);
        explore(grid, i-1,j);
        explore(grid, i,j+1);
        explore(grid, i,j-1);
    }   
    
   
}

 
