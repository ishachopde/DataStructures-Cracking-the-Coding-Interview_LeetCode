class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] matrix = new boolean[s.length()+1];
        matrix[0] = true; // if the string is of size zero or the dictionary has no words
        
        for(int i=0;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(matrix[j] && wordDict.contains(s.substring(j,i))){
                    matrix[i]=true;
                }
            }
        }
        
        return matrix[s.length()];
    }
}
