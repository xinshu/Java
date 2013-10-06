import java.util.*;

public class cc0106{
	public void rotate(int[][] matrix){
		int num = matrix.length;
		for(int i=0; i<=num/2; i++){
			for(int j=i; j<=num/2; j++){
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[j][num-1-i];
				matrix[j][num-1-i] = matrix[num-1-i][num-1-j];
				matrix[num-1-i][num-1-j] = matrix[num-1-j][i];
				matrix[num-1-j][i] = tmp;
			}
		}
	}
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		cc0106 test = new cc0106();
		test.rotate(matrix);
		for(int i =0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}