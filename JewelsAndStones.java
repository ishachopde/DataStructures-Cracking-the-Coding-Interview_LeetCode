class Solution {
    public int numJewelsInStones(String J, String S) {
       /* brute force int counter =0;
        char[] J1 = J.toCharArray();
        char[] S1 = S.toCharArray();
        if(J1 == null || S1 == null){
            return 0;
        }
        for(int i =0; i<J1.length;i++){
            for(int j=0; j<S1.length;j++){
                if(J1[i]==S1[j]){
                    counter++;
                }
            }
        }
        
        return counter;
        */
        
        // using hashset
        
        Set<Character> set = new HashSet();
        
        char[] J1 = J.toCharArray();
        char[] S1 = S.toCharArray();
        
        if(J1 == null || null==S1){
            return 0;
        }
        
        int counter =0;
        for(int i=0;i<J1.length;i++){
            set.add(J1[i]);
        }
        
        for(int i=0; i<S1.length;i++){
            if(set.contains(S1[i])){
                counter++;
            }
        }
        
        return counter;
    }
}
