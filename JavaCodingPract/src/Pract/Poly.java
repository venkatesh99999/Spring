package Pract;

class A
{
	
	public int add(Number a,Number b)
	
	{
		return 2;
	}
public float  add(Integer a,Integer b)
	
	{
		return 1.2f;
	}
}
class B extends A
{
	
}

public class Poly {
	public static void main(String args[]) {

	A a =new A();
	int s=(int)a.add(Integer.parseInt("1"),Integer.parseInt("2"));
System.out.println(s);

}
}
