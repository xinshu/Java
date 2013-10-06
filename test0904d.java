import java.util.*;

public class test0904d{
	public ArrayList<Integer> mintrianglepathsum(ArrayList<ArrayList<Integer>> list){
		ArrayList<Integer> result = new ArrayList<Integer>(list.size()+1);
		if(list==null || list.size()==0) return result;
		if(list.size()==1) {
			result.add(list.get(0).get(0)); 
			result.add(0); 
			return result;
		}
		
		for(int i=list.size()-2; i>=0; i--){
			for(int j=0; j<list.get(i).size(); j++){
				int undermin = Math.min(list.get(i+1).get(j), list.get(i+1).get(j+1));
				list.get(i).set(j, list.get(i).get(j)+undermin);
			}
		}
		
		result.add(list.get(0).get(0));
		result.add(0);
		
		for(int i=1; i<list.size(); i++){
			int undermin = Integer.MAX_VALUE;
			for(int j=0; j<list.get(i).size(); j++){
				undermin = Math.min(undermin, list.get(i).get(j));
			}
			result.add(list.get(i).indexOf(undermin));
		}
		return result;
	}
	
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> sublist1 = new ArrayList<Integer>();
		ArrayList<Integer> sublist2 = new ArrayList<Integer>();
		ArrayList<Integer> sublist3 = new ArrayList<Integer>();
		ArrayList<Integer> sublist4 = new ArrayList<Integer>();
		sublist1.add(2);
		sublist2.add(3); sublist2.add(4);
		sublist3.add(6); sublist3.add(5); sublist3.add(7);
		sublist4.add(4); sublist4.add(1); sublist4.add(8); sublist4.add(3);
		list.add(sublist1); list.add(sublist2); list.add(sublist3); list.add(sublist4);
		
		test0904d test = new test0904d();
		ArrayList<Integer> result = test.mintrianglepathsum(list);
		for(int i: result)
			System.out.print(i + " ");
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}