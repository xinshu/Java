import java.util.*;

public class test0825b{
	public int minDistance(String word1, String word2) {
        // Start typing your Java solution below
        // DO NOT write main() function
		int len1 = word1.length();
		int len2 = word2.length();
        int[][] dis = new int[len1+1][len2+1];
		for(int i=0; i<len1+1; i++){
			dis[i][0] = i;
		}
		for(int i=0; i<len2+1; i++){
			dis[0][i] = i;
		}
		
		for(int i=1; i<len1+1; i++){
			for(int j=1; j<len2+1; j++){
				if(word1.charAt(i-1)==word2.charAt(j-1)){
					dis[i][j] = dis[i-1][j-1];
				}
				else{
					int tmpmin = Math.min(dis[i-1][j], dis[i][j-1]);
					dis[i][j] = 1 + Math.min(dis[i-1][j-1], tmpmin);
				}
			}
		}
		return dis[len1][len2];
    }
	
	public static void main(String[] args){
		String s1 = "studying";
		String s2 =  "sunday";
		test0825b test = new test0825b();
		System.out.println(test.minDistance(s1, s2));
	}
}