import java.util.*;

public class test0903d{

	public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> vaclist = new ArrayList<Integer>();
		list.add(vaclist);
		int start = 0;
		for(int i=0; i<num.length; i++){
			int end = list.size();
			for(int j=start; j<end; j++){
				ArrayList<Integer> tmp = new ArrayList<Integer>(list.get(j));
				tmp.add(num[i]);
				list.add(tmp);
				start = 0;
			}
			if(i+1<num.length && num[i]==num[i+1]){
				start = end;	
			}
		}
		
		/*for(int i=0; i<num.length; i++){
			ArrayList<ArrayList<Integer>> tmplist = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> item : list){
				tmplist.add((ArrayList<Integer>)item.clone());
				item.add(num[i]);
			}
			list.addAll(tmplist);
		}*/
		
		return list;
    }

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		int[] num = {1,2,2,3};
		
		/*for(int i: num)
			System.out.print(i + " ");*/
			
		test0903d test = new test0903d();
		ArrayList<ArrayList<Integer>> list = test.subsetsWithDup(num);
		System.out.println("[");
		for(ArrayList<Integer> tmp : list){
			System.out.print("[ ");
			for(int i : tmp){
				System.out.print(i + " ");
			}
			System.out.print("]");
			System.out.println();
		}
		System.out.print("]");
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}