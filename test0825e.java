import java.util.*;

public class test0825e{
	public int climbStairs(int n) {
        int[] s = new int[n+1];
		s[0] = 1;
		s[1] = 1;
		for(int i=2; i<=n; i++){
			s[i] = s[i-1] + s[i-2];
		}
		return s[n];
    }
	
	public static void main(String[] args){
		test0825e test = new test0825e();
		System.out.println(test.climbStairs(5));
	}
}