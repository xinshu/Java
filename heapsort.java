public class heapsort{
	private void heap(int[] num){
		int N = num.length;
		for(int k=N/2; k>=1; k--){
			sink(num, k, N);
		}
		while(N>1){
			swap(num, 1, N--);
			sink(num, 1, N);
		}
	}
	
	private void sink(int[] num, int k, int N){
		while(2*k<=N){
			int j = 2*k;
			if(j<N && num[j-1]<num[j]) j++;
			if(num[k-1]>=num[j-1]) break;
			swap(num, k, j);
			k = j;
		}
	}
	
	private void swap(int[] num, int i, int j){
		int tmp = num[i-1];
		num[i-1] = num[j-1];
		num[j-1] = tmp;
	}
	
	public static void main(String[] args){
		int[] num = {1,7,3,0,2,2,7,5,6,5,8};
		heapsort test = new heapsort();
		test.heap(num);
		for(int i=0; i<num.length; i++){
			System.out.print(num[i] + ",");
		}
	}
}