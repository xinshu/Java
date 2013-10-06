import java.util.*;

public class test0823{
	public static String addbinary(String a, String b){
		String res = new String();
        int carr = 0;
        for(int i=a.length()-1, j=b.length()-1; i>=0||j>=0||carr>0; i--, j--){
            carr += (i>=0)?a.charAt(i)-'0':0;
            carr += (j>=0)?b.charAt(j)-'0':0;
            res = ((carr%2==0)?'0':'1') + res;
            carr /=2;
        }
        return res;
	}
	
	public static void main(String[] args){
		String a = "110";
		String b = "10110";
		String s = new String();
		s = addbinary(a, b);
		System.out.println(s);
	}
}