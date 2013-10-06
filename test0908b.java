import java.util.*;

public class test0908b{
	public int bs(int[] num, int x){
		int lo = 0;
		int hi = num.length-1;
		while(lo<=hi){
			int mid = (lo+hi)/2;
			if(num[mid]==x) return mid;
			else if(num[mid]>x){
				hi = mid-1;
			}
			else{
				lo = mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		int[] num = {1,2,3,4,5,6,7,8};
		test0908b test = new test0908b();
	
		System.out.println(test.bs(num, 12));
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}