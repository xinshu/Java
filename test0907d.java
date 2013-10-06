import java.util.*;

public class test0907d{
	public boolean isPalindrome(String s){
		s = s.toLowerCase();
		s = s.replaceAll("[^a-z0-9]", "");
		
		for(int i=0; i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
		}
		return true;
	}

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		String s1 = "A man, a plan, a canal: Panama";
		String s2 = "race a car";
		test0907d test = new test0907d();
		
		System.out.println(test.isPalindrome(s1));
		System.out.println(test.isPalindrome(s2));
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}