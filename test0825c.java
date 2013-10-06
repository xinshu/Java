import java.util.*;

public class test0825c{
	public boolean exist(char[][] board, String word) {
        if(board==null) return false;
		if(word==null || word.length()==0) return true;
		int rownum = board.length;
		int colnum = board[0].length;
		boolean[][] visited = new boolean[rownum][colnum];
		for(int i=0; i<rownum; i++){
			for(int j=0; j<colnum; j++){
				if(DFS(board, word, visited, i, j, 0)) return true;
			}
		}
		return false;
    }
	
	private boolean DFS(char[][] b, String word, boolean[][] v, int i, int j, int pos){
		if(v[i][j] || b[i][j]!=word.charAt(pos)) return false;
		if(pos==word.length()-1) return true;
		v[i][j] = true;
		if(i>0 && DFS(b, word, v, i-1, j, pos+1)) return true;
		if(i<b[0].length && DFS(b, word, v, i+1, j, pos+1)) return true;
		if(j>0 && DFS(b, word, v, i, j-1, pos+1)) return true;
		if(j<b[0].length && DFS(b, word, v, i, j+1, pos+1)) return true;
		v[i][j] = false;
		return false;
	}
	public static void main(String[] args){
		char[][] board = {{'a','b','c'}, {'c','b','c'}, {'b','d','e'}};
		String word = "dbc";
		test0825c test = new test0825c();
		System.out.println(test.exist(board, word));
	}
}