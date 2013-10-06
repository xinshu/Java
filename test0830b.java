import java.util.*;

public class test0830b{
	public ArrayList<Integer> maxbenefit(int[] A){
		ArrayList<Integer> ans = new ArrayList<Integer>(3);
		int len = A.length;
		int min = 0, max = 0;
		int buy = A[0];
		int benefit = 0;
		for(int i=1; i<len; i++){
			int tmp = buy;
			buy = Math.min(buy, A[i]);
			if(buy!=tmp) min = i;
			int tmpb = benefit;
			benefit = Math.max(benefit, A[i]-buy);
			if(benefit!=tmpb) max = i;
		}
		ans.add(min);
		ans.add(max);
		ans.add(benefit);
		return ans;
	}
	
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		int[] A = {100,113,110,85,105,102,86,63,81,101,94,106,101,79,94,90,97};
		ArrayList<Integer> ans = new ArrayList<Integer>(3);
		test0830b test = new test0830b();
		ans = test.maxbenefit(A);
		for(int item : ans)
			System.out.println(item);
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}