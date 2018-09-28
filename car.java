class Cars
{
	void rental(String companyName,String location,int reservationNumber)
	{
		System.out.println("Rental car Name="+companyName);
		System.out.println("Rental car Location="+location);
		System.out.println("Rental reservation no="+reservationNumber);
	}
	void rental(String carName,int carModel,String carType,String color)
	
	{ 
		System.out.println("car Name="+carName);
		System.out.println("car Model="+carModel);
		System.out.println("car Type="+carType);
		System.out.println("car Color="+color);

	}
}



class Customer
{
	public static void main(String[] args)
	{
		Cars c=new Cars();
		c.rental("Alamo","Ashbun",788699);
		c.rental("Honda Accord",2018,"Full Size","Orange");
	
	}
}
