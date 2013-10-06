public class isPowerOfTwo{
	public boolean isPowerOfTwo(int n){
		if(n==0) return true;
		return (n>0)&&(n&(n-1))==0;
	}
	
	public static void main(String[] args){
		int n = -9;
		isPowerOfTwo test = new isPowerOfTwo();
		System.out.println(test.isPowerOfTwo(n));
	}
}