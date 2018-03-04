class Solution {
    public int lengthOfLongestSubstring(String s) {
      int beginptr = 0; //the begin ptr starts at the 0th index of the string;
    int result = 0;
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        //traverse the string 
        
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                // if the character is present, we simply change the begin ptr to check if there are other substring with longer length
                beginptr = Math.max(m.get(s.charAt(i)),beginptr);
            }
            m.put(s.charAt(i),i); // the visited char is put at a new index
            result = Math.max(result, i-beginptr+1);
        }
        
        return result;
    }
    
}
