import java.util.*;

public class cc0303a{
	final static int capacity = 2;
	public static class SetOfStack{
		ArrayList<Stack<Integer>> stacklist = new ArrayList<Stack<Integer>>();
		public void push(int val){
			Stack<Integer> sub = getLastStack();
			//System.out.println("substack size: " + sub.size());
			if(sub.size()<capacity) sub.push(val);
			else{
				//System.out.println("create new substack");
				Stack<Integer> newsub = new Stack<Integer>();
				newsub.push(val);
				stacklist.add(newsub);
			}
		}
		public int pop(){
			Stack<Integer> sub = getLastStack();
			int top = sub.pop();
			if(sub.size()==0){
				int num = stacklist.size();
				stacklist.remove(num-1);
			}
			return top;
		}
		public Stack<Integer> getLastStack(){
			if(stacklist.isEmpty()){
				//System.out.println("empty");
				Stack<Integer> newsub = new Stack<Integer>();
				stacklist.add(newsub);
				return newsub;
			}
			int num = stacklist.size();
			//System.out.println("size: " + num);
			return stacklist.get(num-1);
		}
	}
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}