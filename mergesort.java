public class mergesort{
	private static void merge(int[] num){
		merge(num, 0, num.length);
	}
	
	private static void merge(int[] num, int lo, int hi){
		//hi is excluded
		int N = hi - lo;
		if(N<=1) return;
		int mid = (lo+hi)/2;
		merge(num, lo, mid);
		//above mid is excluded
		merge(num, mid, hi);
		
		int[] aux = new int[N];
		int i = lo, j = mid;
		for(int k=0; k<N; k++){
			if(i==mid) aux[k] = num[j++];
			else if(j==hi) aux[k] = num[i++];
			else if(num[i]<num[j]) aux[k] = num[i++];
			else aux[k] = num[j++];
		}
		
		for(int k=0; k<N; k++){
			num[lo+k] = aux[k];
		}
	}
	
	public static void main(String[] args){
		int[] num = {1,7,3,0,2,2,7,5,6,5,8};
		mergesort test = new mergesort();
		test.merge(num);
		for(int i=0; i<num.length; i++){
			System.out.print(num[i] + ",");
		}
	}
}