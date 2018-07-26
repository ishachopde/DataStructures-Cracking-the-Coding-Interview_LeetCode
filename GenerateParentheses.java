class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        generatePHelper(result,"",0,0,n);
        return result;
    }
    
    public void generatePHelper(List<String> result, String s, int open, int close, int n){
        if(s.length() == n*2){
            result.add(s);
            return;
        }
        
        if(open<n){
            generatePHelper(result,s+"(", open+1, close, n);
        }
        if(close<open){
             generatePHelper(result,s+")", open, close+1, n);
        }
    }
}
