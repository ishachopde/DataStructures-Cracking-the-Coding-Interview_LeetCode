class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] result = new int[cost.length];
        if(cost == null||cost.length == 0){ //corner case 1
            return 0;
        }
        
        if(cost.length == 1){  //corner case 2
            return cost[0];
        }
        
        //since we either tak step 1 or 2, we can the store the 0th and 1st index elements as is in result array.
        
        result[0]=cost[0]; //store 0th index
        result[1] = cost[1]; //store 1st index
        
        //now start from 2nd index running to the end of the array
        for(int i=2;i<cost.length;i++){
            result[i] = Math.min(result[i-1], result[i-2])+cost[i];
        }
        
        return Math.min(result[cost.length-1], result[cost.length-2]);
    }
}
