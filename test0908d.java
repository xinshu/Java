import java.util.*;

public class test0908d{
	public void quicksort(int[] num){
		helper(num, 0, num.length-1);
	}
	
	private void helper(int[] num, int l, int r){
		if(l<r){
			int p = partition(num, l, r);
			helper(num, l, p-1);
			helper(num, p+1, r);
		}
	}
	
	private int randomized(int l, int r){
		return l + (int)(Math.random()*(r-l)+1);
	}
	
	private int partition(int[] num, int l, int r){
		//int randr = randomized(l, r);
		//swap(num, randr, r);
		int x = num[r];
		int i = l-1;
		for(int j=l; j<r; j++){
			if(num[j]<=x){
				i = i+1;
				if(i<j)
					swap(num, i, j);
			}
		}
		swap(num, i+1, r);
		return i+1;
	}
	
	private void swap(int[] num, int i, int j){
		int tmp = num[i];
		num[i] = num[j];
		num[j] = tmp;
	}

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		int[] A = {3,1,4,8,5,5,2,6};
		test0908d test = new test0908d();
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