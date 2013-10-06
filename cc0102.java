import java.util.*;

public class cc0102{
	public String reverse(String s){
		int len = s.length();
		char[] sArray =s.toCharArray();
		for(int i=0; i<len/2; i++){
			swap(sArray, i, len-1-i);
		}
		return new String(sArray);
	}
	private void swap(char[] arr, int i, int j){
		char tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		String s = "abcd";
		cc0102 test = new cc0102();
		String result = test.reverse(s);
		System.out.println(result);
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}