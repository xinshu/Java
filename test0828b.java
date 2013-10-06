import java.util.*;

public class test0828b{
	/*public String longestPalindrome(String s) {
        int n = s.length();
    	int begin = 0;
		int maxlen = 1;
		boolean[][] flag = new boolean[n][n];
		for(int i=0; i<n; i++) flag[i][i] = true;
		for(int i=0; i<n-1; i++){
			if(s.charAt(i)==s.charAt(i+1)){
				flag[i][i+1] = true;
				begin = i;
				maxlen = 2;
			}
		}
		for(int len=3; len<=n; len++){
			for(int i=0; i<n-len+1; i++){
				int j = i+len-1;
				if(s.charAt(i)==s.charAt(j) && flag[i+1][j-1]==true){
					flag[i][j] = true;
					begin = i;
					maxlen = len;
				}
			}
		}
		return s.substring(begin, begin+maxlen);
    }*/
	
	/*public String longestPalindrome(String s) {
		int n = s.length();
		if(n==0) return "";
		String longest = s.substring(0,1);
		for(int i=0; i<n-1; i++){
			String p1 = expandAroundCenter(s, i, i);
			if(p1.length()>longest.length()) longest = p1;
			
			String p2 = expandAroundCenter(s, i, i+1);
			if(p2.length()>longest.length()) longest = p2;
		}
		return longest;
    }
	
	private String expandAroundCenter(String s, int i, int j){
		int l = i, r = j;
		int n = s.length();
		while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
			l--;
			r++;
		}
		return s.substring(l+1, r);
	}*/
	
	public String longestPalindrome(String s) {
		String T = preProcess(s);
		int n = T.length();
		int[] p = new int[n];
		int center = 1, right = 1;
		for(int i=1; i<n-1; i++){
			int mirrorofi = 2*center-i;
			p[i] = right>i ? Math.min(right-i, p[mirrorofi]) : 0;
			while((i+1+p[i]<n) && (i-1-p[i]>=0) && T.charAt(i+1+p[i])==T.charAt(i-1-p[i])){
				p[i]++;
				if(i+p[i]>right){
					center = i;
					right = i+p[i];
				}
			}
		}
		int maxlen = 0;
		int centerindex = 1;
		for(int i=1; i<n-1; i++){
			if(p[i]>maxlen){
				maxlen = p[i];
				centerindex = i;
			}
		}
		return s.substring((centerindex-maxlen)/2, (centerindex-maxlen)/2+maxlen);
	}
	
	private String preProcess(String s){
		int n = s.length();
		if(n==0) return "^$";
		StringBuffer strbuf = new StringBuffer('^');
		for(int i=0; i<n; i++){
			strbuf.append('#');
			strbuf.append(s.charAt(i));
		}
		strbuf.append('#');
		strbuf.append('$');
		return strbuf.toString();
	}
	
	public static void main(String[] args){
		String s = "aa"; //"abaabbc";
		test0828b test = new test0828b();
		System.out.println(test.longestPalindrome(s));
	}
}