import java.util.*;

public class test0830{
	public void insertionSort(int[] A){
		int len = A.length;
		for(int i=1; i<len; i++){
			int key = A[i];
			while(i>0 && key<A[i-1]){
				A[i] = A[i-1];
				i--;
			}
			A[i] = key;
		}
	}
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();
		
		int[] A = {4,5,1,3,2,6};
		test0830 test = new test0830();
		test.insertionSort(A);
		for(int i: A)
			System.out.print(i + " ");
			
		long finishtime = System.currentTimeMillis();
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}