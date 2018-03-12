class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        //iterate through the array of strings
        for(String op : ops){
            if(op.equals("+")){
                int top = stack.pop();
                int newtop = top +stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if(op.equals("C")){
                stack.pop();
            } else if(op.equals("D")){
                stack.push(2*stack.peek());
            }    
            else {
                stack.push(Integer.valueOf(op)); // if the element is an integer
            }
        }
        
        int ans =0;
        for(int score :stack){
            
            ans = score+ans;
        }
        return ans;
    }
}
