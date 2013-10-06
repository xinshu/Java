import java.util.*;

public class test0825a{
	public String strStr(String haystack, String needle) {
		int haylen = haystack.length();
		int neelen = needle.length();
		if(haylen<neelen) return null;
		if(neelen<1) return haystack;
		int cnt = 0;
		while(cnt<=haylen-neelen+1){
			int i = 0;
			int begin = cnt;
			while(haystack.charAt(cnt)==needle.charAt(i) && i<neelen){
				cnt++;
				i++;
				if(i==neelen){
					return haystack.substring(begin, cnt);
				}
			}
			cnt++;
		}
		return null;
    }
	
	public static void main(String[] args){
		String s1 = "iamlearningcomputersciencenow";
		String s2 = "you";
		test0825a test = new test0825a();
		System.out.println(test.strStr(s1, s2));
	}
}