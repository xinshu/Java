import java.util.*;

public class test0825d{
	public void sortColors(int[] A) {
		if(A==null || A.length==0) return;
		int r = 0, b = A.length-1;
		int index = 0;
		//be careful, b is dynamic blue index
		while(index<=b){
			if(A[index]==0){ swap(A, index++, r++);}
			else if(A[index]==2){ swap(A, index, b--);}
			else { index++;}
		}
    }
	
	private void swap(int[] A, int i, int j){
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
	
	public static void main(String[] args){
		int[] A = {1,2,1,1,0,2,1,0,0};
		test0825d test = new test0825d();
		System.out.println(A.length);
		test.sortColors(A);
		for(int i : A)
			System.out.print(i + " ");
	}
}