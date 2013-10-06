import java.util.*;

public class cc0108{
	//use isSubstring()
	/******************************************************
	public boolean isRotation(String s1, String s2){
		String doubles1 = s1+s1;
		if(s1.length()==s2.length()){
			return isSubstring(doubles1, s2);
		}
		return false;
	}
	*******************************************************/
	public boolean isRotation(String s1, String s2){
		//
		if(s1.length()!=s2.length()) return false;
		for(int i=0; i<s1.length();){
			int j = 0;
			int start = i;
			if(s1.charAt(i)==s2.charAt(j)){
				while(j<s2.length()&&s1.charAt(i%s1.length())==s2.charAt(j)){
					j++;
					i++;
				}
			}
			if(j==s2.length()) return true;
			i = start +1;
		}
		return false;
	}
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		String s1 = "waterbottleU";
		String s2 = "tlewUaterbot";
		cc0108 test = new cc0108();
	
		System.out.println(test.isRotation(s1,s2));
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}