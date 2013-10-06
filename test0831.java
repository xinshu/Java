import java.util.*;

public class test0831{
	public void heapsort(int[] A){
		if(A==null) return;
		int len = A.length;
		buildheap(A, len);
		while(len>0){
			swap(A, len-1, 0);
			heapify(A, 0, len-1);
			len--;
		}
	}
	
	private void heapify(int[] A, int i, int heapsize){
		int left = 2*(i+1);
		int right = 2*(i+1)+1;
		int largest = i+1;
		if(left<=heapsize && A[left-1]>A[i]){
			largest = left;
		}
		if(right<=heapsize && A[right-1]>A[largest-1]){
			largest = right;
		}
		if(largest!=i+1){
			swap(A, i, largest-1);
			heapify(A, largest-1, heapsize);
		}
	}
	
	private void buildheap(int[] A, int heapsize){
		for(int i= heapsize/2-1; i>=0; i--){
			heapify(A, i, heapsize);
		}
	}
	private void swap(int[] A, int i, int j){
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		int[] A = {3,1,4,8,2,6};
		test0831 test = new test0831();
		test.heapsort(A);
		for(int item : A)
			System.out.print(item + " ");
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}