import java.util.*;

public class test0908{
	private ArrayList<ArrayList<Integer>> permute(int[] num){
		if(num==null) return null;
		return helper(num, 0);
	}
	
	private ArrayList<ArrayList<Integer>> helper(int[] num, int start){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(start>=num.length){result.add(new ArrayList<Integer>());return result;}
		for(ArrayList<Integer> x: helper(num, start+1)){
			for(int i=0; i<=x.size(); i++){
				ArrayList<Integer> tmp = new ArrayList<Integer>(x);
				tmp.add(i, num[start]);
				result.add(tmp);
			}
		}
		return result;
	}
	

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		int[] num = {1,2,3};
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		test0908 test = new test0908();
		result = test.permute(num);
		System.out.println(result);
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}