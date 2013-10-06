import java.util.*;

public class test0907{

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		int[] arr = {1,2,3,4};
		for(int i=0; i<arr.length; i++){
			/*try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				return;
			}*/
			System.out.println(arr[i]);
			if(Thread.interrupted()){
				return;
			}
		}
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}