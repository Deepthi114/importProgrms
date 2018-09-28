class Bank
{
	String name;
	String location;
	String id;
	String pwd;

	Bank(String name,String location)
	{
		this.name=name;
		this.location=location;
	}
	void info()
	{
		
		System.out.println("Bank name:"+this.name);
		System.out.println("Location of Bank:"+this.location);
	}
}
class Customer extends Bank
{
		
	String creat(String account,String name,String doc)
	{
		System.out.println("Creating :"+account);
		System.out.println("Student name:"+name);
		System.out.println("Location:"+this.location);
		System.out.println("Documents:"+doc);
		return "Account Created Successfully";
	}
	void menu()
	{
		System.out.println("Details of Online Banking");
		System.out.println("List==Accounts........Bill Pay......Transfer......Help......Settings");
	}

	void info2(String id,String pwd)
	{
		System.out.println("Enter the LogIn Details");
		System.out.println("Online ID:"+id);
		System.out.println("Passcode:"+pwd);	
	}
}

class OnlineBank
{
	public static void main(String []args)
	{
		Customer cum=new Customer();
		Bank b=new Bank("Bofa","Arlington");
		b.info();
		System.out.println("Status:"+cum.creat("Student Account","Deepthi","i20,Passport"));
		cum.menu();
		cum.info2("Dee****i25","******75");	
		
	}
}







