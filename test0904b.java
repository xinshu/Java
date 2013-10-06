import java.util.*;

public class test0904b{
	public TreeNode mirrortree(TreeNode root){
		if(root==null) return null;
		TreeNode mirror = new TreeNode(root.val);
		mirror.left = mirrortree(root.right);
		mirror.right = mirrortree(root.left);
		return mirror;
	}
	
	private int MAXDepth(TreeNode root, int depth){
		if(root==null) return 0;
		if(root.left==null && root.right==null) return depth;
		int leftd = MAXDepth(root.left, depth+1);
		int rightd = MAXDepth(root.right, depth+1);
		depth = Math.max(leftd, rightd);
		return depth;
	}
	
	private void reshapetree(TreeString sroot, int depth){
		if(depth==1) return;
		if(sroot.left==null) sroot.left = new TreeString("#");
		if(sroot.right==null) sroot.right = new TreeString("#");
		if(sroot.val=="#"){
			sroot.left = new TreeString("#");
			sroot.right = new TreeString("#");
		}
		reshapetree(sroot.left, depth-1);
		reshapetree(sroot.right, depth-1);
	}
	
	private TreeString copytree(TreeNode root){
		if(root==null) return null;
		TreeString sroot = new TreeString(Integer.toString(root.val));
		sroot.left = copytree(root.left);
		sroot.right = copytree(root.right);
		return sroot;
	}
	
	private ArrayList<ArrayList<String>> levelorder(TreeString sroot){
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		ArrayList<TreeString> currlevel = new ArrayList<TreeString>();
		if(sroot==null) return list;
		currlevel.add(sroot);
		while(!currlevel.isEmpty()){
			ArrayList<String> sublist = new ArrayList<String>();
			ArrayList<TreeString> nextlevel = new ArrayList<TreeString>();
			for(TreeString s : currlevel){
				sublist.add(s.val);
				if(s.left!=null) nextlevel.add(s.left);
				if(s.right!=null) nextlevel.add(s.right);
			}
			currlevel = nextlevel;
			list.add(sublist);
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
		
		test0904b test = new test0904b();
		TreeNode mir = test.mirrortree(root);
		int depth = test.MAXDepth(mir, 1);
		System.out.println(depth);//test
		
		TreeString ts = test.copytree(mir);
		test.reshapetree(ts, depth);
		//System.out.println(ts.right.right.right.val);//test
		
		ArrayList<ArrayList<String>> levellist = test.levelorder(ts);
		for(int i=0; i<levellist.size(); i++){
			ArrayList<String> tmp = levellist.get(i);
			for(String s: tmp)
				System.out.print(s + " ");
			System.out.println();
		}
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}