package test;

public class DMD {
	
	public static void main(String args[])
	{
		A a=new B();
		a.show();
		B b=(B) a;
		b.show();
	}

}


class A
{
	public void show()
	{
		System.out.println("In the A");
	}
	public void showA()
	{
		System.out.println("In the AA");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("In the B");
	}
	public void showB()
	{
		System.out.println("In the BB");
	}
}
