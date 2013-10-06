import java.util.*;

public class cc0105{
	public String sCompress(String s){
		int sclen = 0;
		String sc = "";
		StringBuffer strbuf = new StringBuffer();
		for(int i=0; i<s.length();){
			int cnt = 1;
			while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
				cnt++;
				i++;
			}
			i++;
			//System.out.print(s.charAt(i-1));
			//System.out.print(cnt);
			//System.out.println(i);
			sclen += 2;//check the compressed string's length, just for check
			strbuf.append(s.charAt(i-1));
			strbuf.append(cnt);
		}
		sc = strbuf.toString();
		System.out.println(sclen);
		return sc.length()<s.length() ? sc : s;
	}
	public static void main(String[] args){
		long starttime = System.currentTimeMillis();//monitor time
		int cnt = 1;
		/*StringBuffer sbf = new StringBuffer();
		//sbf.append((char)cnt); // produced a smile face, funny
		sbf.append(cnt);
		System.out.println(sbf.toString());*/
		String s = "aabccaaa";
		//String s = "aabcccccaaa";
		cc0105 test = new cc0105();
		String sc = test.sCompress(s);
		System.out.println(sc);
		
		long finishtime = System.currentTimeMillis();//monitor time
		long elapsetime = finishtime - starttime;
		System.out.println();
		System.out.println("elapsed time: " + elapsetime + "ms");
	}
}