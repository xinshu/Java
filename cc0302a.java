import java.util.*;

public class cc0302a{
	public static class StackwiMin extends Stack<Integer>{
		Stack<Integer> smin;
		public StackwiMin(){
			smin = new Stack<Integer>();
		}
		public void push(int val){
			if(val<min()) smin.push(val);
			super.push(val);
		}
		public int min(){
			if(smin.isEmpty()) return Integer.MAX_VALUE;
			else return smin.peek();
		}
		public Integer pop(){
			int top = super.pop();
			if(top==min()) smin.pop();
			return top;
		}
	}
	
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		StackwiMin stack = new StackwiMin();
		stack.push(1);
		stack.push(3);
		stack.push(2);
		System.out.println("stack top: " + stack.peek() + " " + "stack min: " + stack.min());
		System.out.println("stack min size: " + stack.smin.size());
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}