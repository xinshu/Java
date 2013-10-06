public class quicksort{
	private void quick(int[] num, int l, int r){
		if(l>=r) return;
		int pit = num[l];
		int i = l, j = r;
		while(i<j){
			while(i<j && num[j]>=pit) j--;
			if(i<j) num[i++] = num[j];
			while(i<j && num[i]<pit) i++;
			if(i<j) num[j--] = num[i];
		}
		num[i] = pit;
		quick(num, l, i-1);
		quick(num, i+1, r);
	}
	
	public static void main(String[] args){
		int[] num = {1,7,3,0,2,2,7,5,6,5,8};
		quicksort test = new quicksort();
		test.quick(num, 0, num.length-1);
		for(int i=0; i<num.length; i++){
			System.out.print(num[i] + ",");
		}
	}
}