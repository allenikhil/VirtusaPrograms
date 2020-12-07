class Employee //Employee is super class and developer,testenineer are sub classes
{
	String eid,en;
	double es;
	Employee(String eid,String en,double es)
	{
		this.eid=eid;
		this.en=en;
		this.es=es;
	}
public void printEmployeeDetails()
	{
		System.out.println("=======");
		System.out.println("Employee id is:"+eid);
		System.out.println("Employee name is:"+en);
		System.out.println("Employee salary is:"+es);
	}

}
class Developer extends Employee //Intheritance(in order to do inheritance we must do constuctor chaing this can happen in two ways one implict way other explict way)
{
	String tl;
	Developer(String eid,String en,double es,String tl)
	{
		super(eid,en,es);//Explict way of constructor chaining
		this.tl=tl; //this keyword(it is used to intialize current object non static variable)
	}
	public void printEmployeeDetails()  //methodoverriding
	{
		super.printEmployeeDetails(); //super keyword
		System.out.println("Employee type of language is:"+tl);
	}
}
class Testenineer extends Employee //Intheritance(in order to do inheritance we must do constuctor chaing this can happen in two ways one implict way other explict way)
{
	 	String tt;
		Testenineer(String eid,String en,double es,String tt)
		{
			super(eid,en,es);//Explict way of constructor chaining
			this.tt=tt; //this keyword(it is used to intialize current object non static variable)
		}
   public void printEmployeeDetails()//method overriding
	{
		super.printEmployeeDetails();//super keyword
		System.out.println("Employee type of testing is:"+tt);
	}

}
class EmployeeDetails
{
	public static void main(String[] args) 
	 {
		Developer d1=new Developer("e1","nikhil",25000.0,"java");
		d1.printEmployeeDetails();
		Testenineer t1=new Testenineer("e2","rakesh",20000.0,"manual testing");
		t1.printEmployeeDetails();
	}
}
