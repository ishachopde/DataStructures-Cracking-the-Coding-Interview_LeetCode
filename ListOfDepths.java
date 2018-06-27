package Chapter4_TreesGraphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ListOfDepths {
	ArrayList<LinkedList<TreeNodes>> arr = new ArrayList<LinkedList<TreeNodes>>();
	LinkedList<TreeNodes> list = new LinkedList<TreeNodes>();
	Queue<TreeNodes> q = new  LinkedList<TreeNodes>();

	public ArrayList<LinkedList<TreeNodes>> getList(TreeNodes root){
		if(root != null) {
			list.add(root);
		}
		int nodes = list.size();
		while(nodes>0) {
			arr.add(list);
			LinkedList<TreeNodes> list1 = list;
			list = new LinkedList<TreeNodes>();
			for(TreeNodes l : list1) {
				if(l.left !=null) {
					list.add(l.left);
				}
				if(l.right != null) {
					list.add(l.right);
				}
			}		
		}
		return arr;
	}

	public void display(ArrayList<LinkedList<TreeNodes>> al){
		Iterator it = al.iterator();
		while(it.hasNext()){
			TreeNodes head = (TreeNodes)it.next();
			//System.out.print("->" + head.data);
			while(head!=null){
				System.out.print("->" + head.val);
				head = head.next;
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListOfDepths lod = new ListOfDepths();
		TreeNodes root = new TreeNodes(1);
		root.left = new TreeNodes(2);
		root.right = new TreeNodes(3);
		root.left.left = new TreeNodes(4);
		root.left.right = new TreeNodes(5);
		root.right.left = new TreeNodes(6);
		root.right.right = new TreeNodes(7);
		ArrayList<LinkedList<TreeNodes>> res = lod.getList(root);
		lod.display(res);
	}

}
