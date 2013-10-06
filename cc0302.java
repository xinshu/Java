import java.util.*;

public class cc0302{
	public static class StackwiMin extends Stack<NodewiMin>{
		public void push(int val){
			int min = Math.min(val, min());
			NodewiMin node = new NodewiMin(val, min);
			super.push(node);
		}
		public int min(){
			if(this.isEmpty()){
				return Integer.MAX_VALUE;
			}
			else return this.peek().min;
		}
	}
	private static class NodewiMin{
		public int val;
		public int min;
		public NodewiMin(int v, int m){
			val = v;
			min = m;
		}
	}
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		StackwiMin stack = new StackwiMin();
		stack.push(5);
		stack.push(10);
		NodewiMin node = stack.peek();
		System.out.println("stack top: " + node.val + " " + "stack min: " + node.min);
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}