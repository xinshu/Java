import java.util.*;

public class test0907b{
	public ArrayList<ArrayList<String>> partition(String s){
		if(s==null || s.length()==0) return new ArrayList<ArrayList<String>>();
		int len = s.length();
		boolean[][] flag = new boolean[len][len];
		for(int i=0; i<len; i++){
			flag[i][i] = true;
		}
		for(int i=1; i<len; i++){
			flag[i-1][i] = s.charAt(i-1)==s.charAt(i);
			for(int j=i-2; j>=0; j--){
				flag[j][i] = (s.charAt(j)==s.charAt(i) && flag[j+1][i-1]);
			}
		}
		return helper(s, flag, 0);
	}
	
	private ArrayList<ArrayList<String>> helper(String s, boolean[][] flag, int start){
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		if(start==s.length()){
			result.add(new ArrayList<String>());
			return result;
		}
		for(int i=start; i<s.length(); i++){
			if(flag[start][i]){
				for(ArrayList<String> sub: helper(s,flag,i+1)){
					sub.add(0, s.substring(start, i+1));
					result.add(sub);
				}
			}
		}
		return result;
	}

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		String s = "aabcc";
		test0907b test = new test0907b();
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		result = test.partition(s);
		for(int i=0; i<result.size();i++){
			for(String ss: result.get(i))
				System.out.print(ss + " ");
			System.out.println();
		}
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}