abstract class G
{
    public  void move()//If abstract class consist of non static members,it has to be access only through subclass object
	{
		System.out.println("move west...");
	}
}  
class H extends G
{
}
class Abstractpgm4
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		H r1=new H();
		r1.move();
		System.out.println("main ends");
	}
}
