class Demo
{
	int i;
	Demo(int i)
	{
		this.i=i;
	}
}
class B extends Demo
{
	int j;
	B(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
}
class Inheritancepgm1
{
	public static void main(String[] args) 
	{
		A a1=new A(5);
		B b1=new B(2,5);
		System.out.println(a1.i);
	}
}
