/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
       /* recursive solution  //TreeNode result = new TreeNode();
        if(t1 == null )return t2;
        if(t2 == null) return t1;
        
        TreeNode result = new TreeNode(t1.val+t2.val);
        result.left  = mergeTrees(t1.left, t2.left);
        result.right = mergeTrees(t1.right,t2.right);
        
        return result;
        */
        
        /* Iterative Solution*/
        //let us use a stack where we push data as [t1,t2] into the stack
        Stack<TreeNode[]> stack = new Stack<TreeNode[]>();
        stack.push(new TreeNode[] {t1,t2});
        //corner cases
        if(t1 ==null) return t2;
        
        while(!stack.isEmpty()){
            TreeNode[] t = stack.pop();
            if(t[0]==null || t[1]==null){
                continue;
            }
            t[0].val = t[0].val +t[1].val;
            if(t[0].left == null){
                t[0].left = t[1].left;
            }else{
                stack.push(new TreeNode[] {t[0].left, t[1].left});
            }
            
            if(t[0].right == null){
                t[0].right = t[1].right;
            }else{
                stack.push(new TreeNode[] {t[0].right, t[1].right});
            }
            
            
        }
        
        return t1;
    }
}
