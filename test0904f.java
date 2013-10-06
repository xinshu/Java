import java.util.*;

public class test0904f{
	public ArrayList<Integer> maxsubarray(int[] A){
		ArrayList<Integer> ans = new ArrayList<Integer>(3);
		int sum = 0, presum = A[0];
		int left = 0, right = 0;
		for(int i=0; i<A.length; i++){
			if(A[i]>sum+A[i]){
				left = i;
				sum = A[i];
			}
			else{
				sum += A[i];
			}
			if(presum<sum){
				presum = sum;
				right = i;
			}
		}
		ans.add(presum);
		ans.add(left);
		ans.add(right);
		return ans;
	}
	
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		int[] A = {100,113,110,85,105,102,86,63,81,101,94,106,101,79,94,90,97};
		int[] B = new int[A.length-1];
		for(int i=1; i<A.length; i++){
			B[i-1] = A[i]-A[i-1];
		}
		ArrayList<Integer> ans = new ArrayList<Integer>(3);
		test0904f test = new test0904f();
		ans = test.maxsubarray(B);
		for(int item : ans)
			System.out.print(item + " ");
		System.out.println();
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}