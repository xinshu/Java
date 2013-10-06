import java.util.*;

public class test0904c{
	public int maxpathsum(TreeNode root){
		if(root==null) return 0;
		ArrayList<Integer> tmax = new ArrayList<Integer>();
		tmax.add(Integer.MIN_VALUE);
		sidemax(root, tmax);
		return tmax.get(0);
	}
	
	public int sidemax(TreeNode root, ArrayList<Integer> tmax){
		if(root==null) return 0;
		//if(root.left==null && root.right==null) return root.val;;
		int leftsum = sidemax(root.left, tmax);
		int rightsum = sidemax(root.right, tmax);
		tmax.set(0, Math.max(tmax.get(0), leftsum+rightsum+root.val));
		return Math.max(leftsum+root.val, rightsum+root.val);
	}
	

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		TreeNode root = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn4 = new TreeNode(4);
		TreeNode tn5 = new TreeNode(5);
		TreeNode tn6 = new TreeNode(6);
		TreeNode tn7 = new TreeNode(7);
		root.left = tn2;
		root.right = tn3;
		tn2.left = tn4;
		tn2.right = tn5;
		tn3.right = tn6;
		tn5.left = tn7;
		
		test0904c test = new test0904c();
		
		System.out.println(test.maxpathsum(root));
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}