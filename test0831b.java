import java.util.*;

public class test0831b{
	public void quicksort(int[] A){
		helper(A, 0, A.length-1);
	}
	
	private void helper(int[] A, int p, int r){
		if(p<r){
			//int q = partition(A, p, r);
			int q = randomized(A, p, r);
			helper(A, p, q-1);
			helper(A, q+1, r);
		}
	}
	
	private int randomized(int[] A, int p, int r){
		int i = p + (int)(Math.random()*(r-p)+1);
		swap(A, i, r);
		return partition(A, p, r);
	}

	private int partition(int[] A, int p, int r){
		int x = A[p];
		int i = p-1;
		int j = r+1;
		while(true){
			do{
				j--;
			}while(j>=p && A[j]>x);
			do{
				i++;
			}while(i<=r && A[i]<=x);
			if(i<j) swap(A, i, j);
			else{
				swap(A, p, j);
				return j;
			}
		}
	}

	private void swap(int[] A, int i, int j){
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		int[] A = {3,1,4,5,5,8,2,6};
		test0831b test = new test0831b();
		test.quicksort(A);
		for(int item : A)
			System.out.print(item + " ");
	
		System.out.println();
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}