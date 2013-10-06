import java.util.*;

public class test0904a{

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		/*PriorityQueue<Integer> heap = new PriorityQueue<Integer>(5);
		heap.add(5);
		heap.add(6);
		heap.add(3);
		heap.add(1);
		heap.add(1);
		for(int item : heap)
			System.out.print(item + " ");
		System.out.println();
		while(!heap.isEmpty()){
			System.out.print(heap.poll() + " ");
		}*/
		ArrayList<String> list = new ArrayList<String>();
		list.add(Integer.toString(10));
		list.add("#");
		System.out.println(list.get(1));
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}