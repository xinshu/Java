import java.util.*;

public class test0904e{
	public ArrayList<ArrayList<Integer>> climbway(int n){
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		if(n==1){
			ArrayList<Integer> sub = new ArrayList<Integer>();
			sub.add(1); list.add(sub); return list;}
		if(n==2){
			ArrayList<Integer> sub1 = new ArrayList<Integer>();
			sub1.add(1); sub1.add(1); list.add(sub1);
			ArrayList<Integer> sub2 = new ArrayList<Integer>();
			sub2.add(2); list.add(sub2);
			return list;
		}
		for(ArrayList<Integer> sub: climbway(n-2)){
			ArrayList<Integer> tmp = new ArrayList<Integer>(sub);
			tmp.add(2);
			list.add(tmp);
		}
		for(ArrayList<Integer> sub: climbway(n-1)){
			ArrayList<Integer> tmp = new ArrayList<Integer>(sub);
			tmp.add(1);
			list.add(tmp);
		}
		return list;
	}
	
	/*private int climbnum(int n){
		if(n==1) return 1;
		if(n==2) return 2;
		return climbnum(n-1) + climbnum(n-2);
	}*/
	
	private int climbnum(int n){
		int[] s = new int[n+1];
		s[0] = 1; s[1] = 1;
		for(int i=2; i<=n; i++){
			s[i] = s[i-1] +s[i-2];
		}
		return s[n];
	}
	
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		test0904e test = new test0904e();
		list = test.climbway(7);
		System.out.println(test.climbnum(7));
		for(int i=0; i<list.size(); i++){
			ArrayList<Integer> sub = list.get(i);
			for(int step : sub)
				System.out.print(step + " ");
			System.out.println();
		}
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}