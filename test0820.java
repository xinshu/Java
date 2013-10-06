import java.util.*;
import java.lang.*;

public class test0820{
	public static void main(String[] str){
		int a = Integer.valueOf('5');
		int b = Integer.valueOf("5");
		System.out.println(a + ", " + b);
		
		/*int[] a = {1,2,3};
		int[] b = new int[a.length+1];
		b = Arrays.copyOfRange(a, 0, 1);
		for(int i=0; i<b.length; i++){
			System.out.println(b[i]);
		}*/
		
		/*ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i=0; i<3; i++){
			a.add(i);
			b.add(2-i);
		}
		System.out.println(a==b);*/
	}
}