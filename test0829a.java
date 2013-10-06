import java.util.*;

public class test0829a{
	public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0) return 0;
		int len = s.length();
		int result = 0;
		int begin = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<len; i++){
			if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))>=begin){
				result = Math.max(result, i-begin);
				begin = map.get(s.charAt(i))+1;
			}
			map.put(s.charAt(i), i);
		}
		result = Math.max(result, len-begin);
		return result;
    }
	
	public static void main(String[] args){
		String s = "abcdde"; //"acdbadeghtusjsrtuy";
		test0829a test = new test0829a();
		System.out.println(test.lengthOfLongestSubstring(s));
	}
}