import java.util.*;

public class cc0101{
	//only consider the lower case letters in this isUniqueChar()
	private boolean isUniqueChar(String s){
		if(s.length()>26) return false;
		int checker = 0;
		for(int i=0; i<s.length(); i++){
			int val = s.charAt(i)-'a';
			if((checker & 1<<val)>0) return false;
			checker |= 1<<val;
		}
		return true;
	}
	private boolean isUnique(String s){
		if(s.length()>256) return false;
		boolean[] cnt = new boolean[256];
		for(int i=0; i<s.length(); i++){
			if(cnt[s.charAt(i)]) return false;
			cnt[s.charAt(i)] = true;
		}
		return true;
	}
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		String s ="dovri";
		cc0101 test = new cc0101();
		
		System.out.println(test.isUniqueChar(s));
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}