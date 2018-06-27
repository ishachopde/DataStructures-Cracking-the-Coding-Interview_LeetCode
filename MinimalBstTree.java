package Chapter4_TreesGraphs;

public class MinimalBstTree {

	public TreeNodes bst(int[] arr) {
		return helper(arr, 0, arr.length-1);
	}
	
	public TreeNodes helper(int arr[], int start, int end) {
		if(start > end) return null;
		
		int mid = (start +end)/2;
		TreeNodes root = new TreeNodes(arr[mid]);
		root.left = helper(arr, start, mid-1);
		root.right = helper(arr, mid+1, end);
		return root;
	}
	
	public void preOrder(TreeNodes root) {
		if(root == null) return;
		System.out.println(root.val+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimalBstTree mbt = new MinimalBstTree();
		int[] arr = {1,2,3,4,5,6,7,8,9};
		TreeNodes res = mbt.bst(arr);
		mbt.preOrder(res);		
	}

}
