abstract class Math 
{	
	int x=100;
	int y=200;
	Math()
	{

	}

	Math(int x,int y)
	{
		this.x=x;
		this.y=y;
	}	
	abstract void details();
}
class Add extends Math
{
	Add()
	{
		super(10,20);
		System.out.println("Addition");
	}
	void details()
	{
		
		System.out.println(this.x+this.y);
	}

}
class Sub extends Math
{
	Sub()
	{
		System.out.println("Subtraction");
	}
	void details()
	{
		
		System.out.println(this.y-this.x);
	}

}

class MathAbstrt
{
	public static void main(String[]args)
	{
		Add a=new Add();
		a.details();
		Sub b=new Sub();
		b.details();
	}
}