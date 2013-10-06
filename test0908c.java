import java.util.*;

public class test0908c{
	public int rbs(int[] num, int x){
		int lo = 0;
		int hi = num.length-1;
		while(lo<=hi){
			int mid = (lo+hi)/2;
			if(num[mid]==x) return mid;
			else if(num[lo]==x) return lo;
			else if(num[lo]<x && num[mid]>x) hi = mid-1;
			else if(num[hi]==x) return hi;
			else lo = mid+1;
			/*if(num[lo]<=num[mid]){
				if(num[mid]>x && num[lo]<=x) hi = mid-1;
				else lo = mid+1;
			}
			else{
				if(num[mid]<x && num[hi]>=x) lo = mid+1;
				else hi = mid-1;
			}*/
		}
		return -1;
	}

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		
		int[] num = {5,6,7,8,1,2,3,4};
		test0908c test = new test0908c();
		int x = Integer.parseInt(args[0]);
		System.out.println(test.rbs(num, x));
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}