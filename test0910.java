import java.util.*;

public class test0910{
	private boolean isSubString(String s, String ss){
		for(int start=0; start<=s.length()-ss.length();){
			int i = start;
			int j = 0;
			//judge index firstly
			while(j<ss.length() && s.charAt(i)==ss.charAt(j)){
				i++;
				j++;
			}
			if(j==ss.length()) return true;
			start++;
		}
		return false;
	}
	
	private boolean isSubSequence(String s, String ss){
		int i = 0, j = 0;
		int start = 0;
		while(j<ss.length()){
			for(i=start; i<=s.length()-ss.length();i++){
				if(ss.charAt(j)==s.charAt(i)) j++;
				if(j==ss.length()) return true;
			}
			start++;
			if(start>s.length()-ss.length()) return false;
			j = 0;
		}
		return false;
	}
	
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		String s = "abcdgfhjtiv,;g/r[v";
		String ss = "f.";
		boolean result = false;
		test0910 test = new test0910();
		result = test.isSubSequence(s, ss);
		System.out.println(result);
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}