import java.util.*;

public class t0918{
	private void quicksort(int[] num){
		qs(num, 0, num.length-1);
	}
	private void qs(int[] num, int i, int j){
		if(i<j){
			int p = partition(num, i, j);
			qs(num, i, p-1);
			qs(num, p+1, j);
		}
	}
	private int partition(int[] num, int l, int r){
		int pivot = num[r];
		int i = l-1;
		for(int j=l; j<r; j++){
			if(num[j]<pivot){
				i = i+1;
				if(i!=j){
					swap(num, i, j);
				}
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
		int[] num = {3,4,1,2,5,2};
		t0918 test = new t0918();
		test.quicksort(num);
		for(int item : num)
			System.out.print(item + " ");
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}