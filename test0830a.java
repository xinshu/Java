import java.util.*;

public class test0830a{
	public ArrayList<Integer> maxsubarray(int[] A){
		return helper(A, 0, A.length-1);
	}
	
	private ArrayList<Integer> helper(int[] A, int low, int high){
		ArrayList<Integer> ans = new ArrayList<Integer>(3);
		ans.add(low);
		ans.add(low);
		ans.add(A[low]);
		if(low==high) return ans;
		int mid = (low+high)/2;
		ArrayList<Integer> ansleft = new ArrayList<Integer>(3);
		ArrayList<Integer> ansright = new ArrayList<Integer>(3);
		ansleft = helper(A, low, mid);
		ansright = helper(A, mid+1, high);
		ArrayList<Integer> anscross = new ArrayList<Integer>(3);
		anscross = findmaxcross(A, low, high, mid);
		if(ansleft.get(2)>=ansright.get(2) && ansleft.get(2)>=anscross.get(2)){
			return ansleft;
		}
		else if(ansright.get(2)>=ansleft.get(2) && ansright.get(2)>=anscross.get(2)){
			return ansright;
		}
		else{
			return anscross;
		}
	}
	
	private ArrayList<Integer> findmaxcross(int[] A, int low, int high, int mid){
		ArrayList<Integer> ans = new ArrayList<Integer>(3);
		int leftsum = Integer.MIN_VALUE;
		int maxleft = mid;
		int rightsum = Integer.MIN_VALUE;
		int maxright = mid+1;
		int sum = 0;
		for(int i=mid; i>=low; i--){
			sum += A[i];
			if(sum>leftsum){
				leftsum = sum;
				maxleft = i;
			}
		}
		sum = 0;
		for(int i=mid+1; i<=high; i++){
			sum += A[i];
			if(sum>rightsum){
				rightsum = sum;
				maxright = i;
			}
		}
		ans.add(maxleft);
		ans.add(maxright);
		ans.add(leftsum + rightsum);
		return ans;
	}

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		int[] A = {100,113,110,85,105,102,86,63,81,101,94,106,101,79,94,90,97};
		int[] B = new int[A.length-1];
		for(int i=1; i<A.length; i++){
			B[i-1] = A[i]-A[i-1];
		}
		test0830a test = new test0830a();
		ArrayList<Integer> ans = new ArrayList<Integer>(3);
		ans = test.maxsubarray(B);
		for(int item : ans)
			System.out.println(item);
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}