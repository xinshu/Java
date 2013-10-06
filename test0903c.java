import java.util.*;

public class test0903c{

	public ArrayList<ArrayList<Integer>> subsets(int[] num) {
		Arrays.sort(num);
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> vaclist = new ArrayList<Integer>();
		list.add(vaclist);
		for(int i=0; i<num.length; i++){
			ArrayList<ArrayList<Integer>> tmplist = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> item : list){
				//ArrayList<Integer> tmp = (ArrayList<Integer>)item.clone();
				//tmplist.add((ArrayList<Integer>)item.clone());
				//ArrayList<Integer> newitem = new ArrayList<Integer>(item);
				//tmplist.add(newitem);
				tmplist.add(new ArrayList<Integer>(item));
				//tmplist.add(tmp);
				item.add(num[i]);
			}
			list.addAll(tmplist);
		}
		return list;
    }

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		int[] num = {1,5,3};
		
		/*for(int i: num)
			System.out.print(i + " ");*/
			
		test0903c test = new test0903c();
		ArrayList<ArrayList<Integer>> list = test.subsets(num);
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