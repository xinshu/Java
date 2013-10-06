import java.util.*;

public class test0908a{
	public ArrayList<ArrayList<Integer>> cutrod(int len, int[] price){
		//expected price.length>=rod length len
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> revenue = new ArrayList<Integer>(len);
		ArrayList<Integer> solution = new ArrayList<Integer>(len);
		for(int i=0; i<len; i++){
			revenue.add(price[i]);
			solution.add(i+1);
		}
		for(int i=0; i<len; i++){
			for(int j=0; j<i; j++){
				int tmprev = revenue.get(i-j-1)+price[j];
				if(revenue.get(i)<tmprev){
					revenue.set(i, tmprev);
					solution.set(i, j+1);
				}
			}
		}
		result.add(revenue);
		result.add(solution);
		return result;
	}
	
	
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		int[] price = {1,5,8,9,10,17,17,20,24,30};
		int len = 10;
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		test0908a test = new test0908a();
		result = test.cutrod(len, price);
		System.out.println(result);
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}