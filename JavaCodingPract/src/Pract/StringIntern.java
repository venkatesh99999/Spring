package Pract;

public class StringIntern {

	public static void main(String args[])
	{
		String s1="hello";
		String s2=new String("hello");
		System.out.println(s1==s2);
		String s3=s1.intern();
		String s4=new String("hello").intern();
		String s5=new String("hello").intern();
		System.out.println(s4==s5);
		
	}
}
