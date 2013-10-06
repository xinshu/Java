import java.util.*;

public class test0828a{
	public String convert(String s, int nRows) {
        assert(s!=null);
		if(nRows==1) return s;
		
		StringBuffer strbuf = new StringBuffer();
		int diff = 2*nRows-2;
		for(int i=0; i<nRows; i++){
			int head = i;
			while(head<s.length()){
				strbuf.append(s.charAt(head));
				head += diff;
				if(i!=0 && i!=nRows-1 && head - 2*i < s.length()){
					strbuf.append(s.charAt(head-2*i));
				}
			}
		}
		return strbuf.toString();
    }
	
	public static void main(String[] args){
		String s = "PAYPALISHIRING";
		int n = 3;
		test0828a test = new test0828a();
		System.out.println(test.convert(s, n));
	}
}