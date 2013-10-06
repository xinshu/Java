import java.util.*;

public class test0826a{
	public ArrayList<String> letterCombinations(String digits) {
       ArrayList<String> result = new ArrayList<String>();
	   if(digits==null || digits.length()==0) return result;
	   helper(digits, 0, new StringBuffer(), result);
	   return result;
	}
	
	private void helper(String digits, int pos, StringBuffer strbuf, 
					ArrayList<String> result){
		String[] keymap = {"0", "1", "abc", "def", "ghi", "jkl", "mno", 
			"pqrs", "tuv", "wxyz"};
		if(pos==digits.length()){
			result.add(strbuf.toString());
			return;
		}
		int n = digits.charAt(pos)-'0';
		String key = keymap[n];
		for(int i=0; i<key.length(); i++){
			StringBuffer newstr = new StringBuffer(strbuf);
			newstr.append(key.charAt(i));
			helper(digits, pos+1, newstr, result);
			newstr.deleteCharAt(newstr.length()-1);
		}
	}
	
	public static void main(String[] args){
		String digits = "66";
		test0826a test = new test0826a();
		ArrayList<String> list = new ArrayList<String>();
		list = test.letterCombinations(digits);
		for(String s: list)
			System.out.println(s);
		System.out.println(list.size());
	}
}