import java.util.*;

public class cc0104{
	public String replace(String s){
		//int cnttaispace = 0;
		int end = s.length()-1;
		//System.out.println(end);
		char[] sArr = s.toCharArray();
		while(sArr[end]==' '){
			end--;
			//cnttailspace++;
		}
		//System.out.println(end);
		for(int i=0; i<end+1;){
			if(sArr[i]==' ' && sArr[i+1]!=' '){
				rephelper(sArr, i);
				end += 2;
				i += 2;
			}
			i++;
			//System.out.println(end);
			//System.out.println("i : " + i + " " + s.charAt(i));
		}
		return new String(sArr);
	}
	private void rephelper(char[] arr, int i){
		int end = arr.length-1;
		while(arr[end]==' ') end--;
		for(int j=end; j>i; j--){
			arr[j+2] = arr[j];
		}
		arr[i] = '%';
		arr[i+1] = '2';
		arr[i+2] = '0';
	}

	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		String s = "Mr John Smith     ";
		char[] sArr = s.toCharArray();
		cc0104 test = new cc0104();
		String result = test.replace(s);
		System.out.println(result);
		/*System.out.println(sArr.length);
		for(char c : sArr)
			System.out.print(c);
		System.out.println(".");*/
		//System.out.println(sArr[2]==' ');
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}