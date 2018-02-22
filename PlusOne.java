class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int i;
        for(i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i] =0;
        }
        
        int newNumber[] = new int[n+1];
        newNumber[0]=1;
        for(i=n-1;i>0;i--){
            newNumber[i+1]=digits[i];
        }
        return newNumber;
    }
    
    

}