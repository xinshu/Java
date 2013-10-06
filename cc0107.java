import java.util.*;

public class cc0107{
	public void setZero(int[][] matrix){
		int rnum = matrix.length;
		int cnum = matrix[0].length;
		boolean[] cntzero = new boolean[rnum+cnum];
		for(int i=0; i<rnum; i++){
			for(int j=0; j<cnum; j++){
				if(matrix[i][j]==0){
					if(!cntzero[i]) cntzero[i] = true;
					if(!cntzero[cnum+j]) cntzero[cnum+j] = true;
				}
			}
		}
		for(int i=0; i<rnum+cnum; i++){
			if(cntzero[i]&&i<rnum){
				for(int j=0; j<cnum; j++){
					matrix[i][j] = 0;
				}
			}
			else if(cntzero[i]&&i>=rnum){
				for(int j=0; j<rnum; j++){
					matrix[j][i-rnum] = 0;
				}
			}
		}
	}

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		int[][] matrix = {{1,1,0,1},{0,1,1,1},{0,0,0,1},{1,1,1,1}};
		cc0107 test = new cc0107();
		test.setZero(matrix);
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