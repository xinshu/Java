import java.util.*;

public class test0828{
	public int atoi(String str) {
        assert(str!=null);
		if(str.length()==0) return 0;
		
		int len = str.length();
		int i = 0;
		int sgn = 1;
		while(i<len && str.charAt(i)==' ') i++;
		
		if(i<len && str.charAt(i)=='-'){
			sgn = -1;
			i++;
		}
		else if(i<len && str.charAt(i)=='+'){
			sgn = 1;
			i++;
		}
		
		int num = 0;
		while(i<len && Character.isDigit(str.charAt(i))){
			if((num==214748364 && (str.charAt(i)-'0')>7) || 
				num>214748364){
				return sgn>0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			num = num*10+(str.charAt(i)-'0');
			i++;
		}
		return sgn>0 ? num : -num;
    }
	
	public static void main(String[] args){
		String s = "  -+8921";
		test0828 test = new test0828();
		System.out.println(test.atoi(s));
	}
}