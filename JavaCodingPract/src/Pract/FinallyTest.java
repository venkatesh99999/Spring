package Pract;

public class FinallyTest {
	
	
	public static  void vargsdemo(int ...a)
	{
		int sum=0;
		for(int i:a)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
	}
	public static  void objarr(int[] a)
	{
		int sum=0;
		for(int i:a)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
	}

	public static void main(String args[])
	{
		try
		{
			int a=1/0;
			System.out.println("In the try");
			
		}
		catch(Exception e)
		{
			System.out.println("in the ctach block");
		}
		
		finally
		{
			//int a=1/0;
			System.out.println("In the finally");
		}
		vargsdemo(1,2,3);
		int a[] = null;
		objarr(a);
		System.out.println("In the main");
	}
}
