import java.util.*;

public class test0908j{
	public ArrayList<Integer> postorder(TreeNode root){
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if(root==null) return list;
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode tmp = stack.peek();
			if(tmp.left!=null){
				stack.push(tmp.left);
				tmp.left = null;
			}
			else{
				if(tmp.right!=null){
					stack.push(tmp.right);
					tmp.right = null;
				}
				else{
					list.add(tmp.val);
					stack.pop();
				}
			}
		}
		return list;
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
		test0908j test = new test0908j();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = test.postorder(root);
		System.out.println(list);
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}