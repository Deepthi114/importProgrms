abstract class Employee
{
	String name;
	int members=4;

	Employee()
	{
		this.name="Mahee";
		System.out.println("My Name:"+this.name);
	}
	Employee(String address)
	{
		System.out.println("My Address:"+address);
	}
	abstract void details();
	
}
class Info extends Employee
{
	Info(String degree)
	{
		super("VA");
		System.out.println("My degree:"+degree);
	}
	void details()
	{
		System.out.println("Members in my Family:"+this.members);
	}

public static void main(String[]args)
	{
	Info i=new Info("Masters");
	i.details();
	}

}
