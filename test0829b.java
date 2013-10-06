import java.util.*;

public class test0829b{
	public double findMedianSortedArrays(int A[], int B[]) {
        int a = 0, b = 0;
		double result = 0.0, evenaux = 0.0;
		int len = A.length + B.length;
		for(int i=0; i<len/2+1; i++){
			if(a == A.length) result = B[b++];
			else if(b==B.length) result = A[a++];
			else{
				if(A[a]>B[b]) result = B[b++];
				else result = A[a++];
			}
			if(len%2==0 && i+1==len/2) evenaux = result;
		}
		return len%2==0? (result+evenaux)/2 : result;
    }
	
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();
		int[] A = {1,3,5,8,9,11};
		int[] B = {1,5,9,20,30};
		test0829b test = new test0829b();
		System.out.println(test.findMedianSortedArrays(A, B));
		long finishtime = System.currentTimeMillis();
		long elapsetime = finishtime - starttime;
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}