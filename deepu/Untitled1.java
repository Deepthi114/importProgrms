abstract class Employee
{
	int salary;
	Employee(String name,String salary)
	{
		this.name=name;
		this.salary=salary;
	}
	abstract void payment();
}
class FullTime extends Employee
{
	FullTime()
	{
		super("Mahesh","100k");
		System.out.println("Name:"+this.name);
	}
	void payment()
	{
		System.out.println("Salary:"+this.salary);
	}
	public static void main(String[]args)
	{
		FullTime ft=new Fulltime();
	}

}
