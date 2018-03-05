class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
       // Using binary search
        int n1= nums1.length;
        int n2=nums2.length;
        
        //always make sure array1 is smaller than second array
        if(n1>n2){
            return findMedianSortedArrays(nums2,nums1);
        }
        
        //now for the partition
        int start = 0;// start 
        int end = n1;
        
        // we keep doing this until start <=end
        while(start<=end){
            int part1 = (start+end)/2;
            int part2 = (n1+ n2+1)/2 - part1;
        
            int maxleftA = (part1 == 0) ? Integer.MIN_VALUE : nums1[part1-1]; 
            int maxleftB = (part2 == 0) ? Integer.MIN_VALUE : nums2[part2-1];
            int minrightA = (part1 == n1) ? Integer.MAX_VALUE : nums1[part1];
            int minrightB = (part2 == n2) ? Integer.MAX_VALUE : nums2[part2];
            System.out.println(maxleftA);
            if(maxleftA<=minrightB && maxleftB<=minrightA){
                
                if((n1+n2)%2 ==0){
                    return (double)((Math.max(maxleftA, maxleftB)+Math.min(minrightA,minrightB)))/2;
                }else{
                     return (double)Math.max(maxleftA,maxleftB);
                }
               
            }else if(maxleftA >minrightB){
                end = part1-1;
            }else{
                start = part1+1;
            }
        
        }
        return 0.0;   
    }
}
