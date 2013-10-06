import java.util.*;
//import java.lang.*;

public class cc0301{
	int stackSize = 5;
	int stackNum = 3;
	int[] buffer = new int[stackSize*stackNum];
	int[] stackPointer = {-1,-1,-1};
	
	private void push(int sn, int val) throws Exception{
		if(stackPointer[sn]+1>=stackSize){
			throw new Exception("out of space");
		}
		stackPointer[sn]++;
		buffer[snindexinbuffer(sn)] = val;
	}
	
	private int pop(int sn) throws Exception{
		if(stackPointer[sn]==-1){
			throw new Exception("trying to pop an empty stack");
		}
		int val = buffer[snindexinbuffer(sn)];
		buffer[snindexinbuffer(sn)] = 0;
		stackPointer[sn]--;
		return val;
	}
	
	private int peek(int sn) throws Exception{
		if(stackPointer[sn]==-1){
			throw new Exception("this is an empty stack");
		}
		return buffer[snindexinbuffer(sn)];
	}
	
	private boolean isEmpty(int sn){
		if(stackPointer[sn]==-1) return true;
		else return false;
	}
	
	private int snindexinbuffer(int sn){
		return stackSize*sn+stackPointer[sn];
	}

	public static void main(String[] args) throws Exception{
		long starttime = System.currentTimeMillis();//monitor time
		
		cc0301 test = new cc0301();
		test.push(2,1);
		test.push(2,2);
		test.push(2,4);
		test.push(2,5);
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}