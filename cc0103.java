import java.util.*;

public class cc0103{
	public boolean isPermutation(String s1, String s2){
		if(s1.length()!=s2.length()) return false;
		int[] cnt = new int[256];
		for(int i=0; i<s1.length(); i++){
			cnt[s1.charAt(i)]++;
		}
		for(int i=0; i<s2.length(); i++){
			cnt[s2.charAt(i)]--;
			if(cnt[s2.charAt(i)]<0) return false;
		}
		return true;
	}
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		String s1 = "abcd", s2 = "abcd";
		cc0103 test = new cc0103();
		System.out.println(test.isPermutation(s1, s2));
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}