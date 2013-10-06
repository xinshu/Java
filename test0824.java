import java.util.*;

public class test0824{
	public static void main(String[] args){
		//ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		//System.out.println(list==null);
		/*String s = new String();
		s = "12";
		s += 'c';
		System.out.println(s);*/
		
		/*int count = 1 << 30;
		System.out.println(count);*/
		
		String path = "/a/./b////../c/";
		String[] splits = path.trim().split("/");
		System.out.println("starts:");
		for(String s : splits)
			System.out.println(s);
		System.out.println(splits.length);
 	}
}