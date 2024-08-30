package Pract;

public class StringPract {
	
	public static void main(String args[])
	{
		String s="Venkatesh9";
		///
		//String regExp="(.*)en(.*)";
		String regExp=".*\\d.*";
		System.out.println(s.matches(regExp));
		
	}

}
