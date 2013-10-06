public class testequals{
	public static void main(String[] args){
		Integer i = new Integer(10);
		Integer j = i;
		boolean b = (i==j);
		System.out.println(b);
		
		i = new Integer(10);
		j = new Integer(10);
		b = (i==j);
		System.out.println(b);
		
		b = i.equals(j);
		System.out.println(b);
	}
}