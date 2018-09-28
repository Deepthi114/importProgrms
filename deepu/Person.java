class Emp
{
	int eId;
	String eName;
	float eSal;

	Emp(int eId,String eName,Float eSal)
	{
		this.eId=eId;
		this.eName=eName;
		this.eSal=eSal;
	}
	void info()
	{
		System.out.println("Employee ID:"+eId);
		System.out.println("Employee Name:"+eName);
		System.out.println("Salary:"+eSal);
	}
}
class Employeee
{
	public static void main(String []args)
	{
		Emp e1=new Emp(111,"Deepthi",8600.99f);
		e1.info();
		Emp e2=new Emp(222,"Mahesh",8700.99f);
		e2.info();
}
	