class RentalHouse
{
	void lease()//menthod with no returntype and no parameters
	{
		System.out.println("Renting for      1.Apartments 2.Town houses 3.Independent Houses");
	}
	void apartment(int buildingNumber,int roomNum,String city,String state)//method overloading apartment1 details
	{
		System.out.println("Apartment Building Number:"+buildingNumber);
		System.out.println("Apartment Room number:"+roomNum);
		System.out.println("City:"+city);
		System.out.println("State:"+state);
	}
	void apartment(int buildingNumber,char roomNum,String city,String state)//method overloading apartment2 details
	{
		System.out.println("Apartment Building Number:"+buildingNumber);
		System.out.println("Apartment Room number:"+roomNum);
		System.out.println("City:"+city);
		System.out.println("State:"+state);
	}
	void townHouse(int houseNum,String city,String state)
	{
		System.out.println("Town house Number :"+houseNum);
		System.out.println("City:"+city);
		System.out.println("State:"+state);
	}
	void customer(String customerName,int customerPhnNumber,String customerIdProof)
	{
		System.out.println("Customer Name :"+customerName);
		System.out.println("Phone number:"+customerPhnNumber);
		System.out.println("Id Proof:"+customerIdProof);
	}
	void takeLease(String renting)//method no returntype withparameters....Main_block to sub_block
	{
		System.out.println("Want to take a lease for :"+renting);
	}
	String payRent(int deposit)//method with returntype and with parameters........ return value from sub_block to main_block
	{
		System.out.println("Deposit Amount is:"+deposit);
		return "Deposit Paid";
	}
	String newLease()//method with returntype ....... Sub_block to Main_block 
	{
		return "Approved";
	}
}


class Resident
{
	public static void main(String[] args) 
	{
		RentalHouse rh=new RentalHouse();
		rh.lease();
		rh.apartment(111,405,"Fairfax","Virginia");
		rh.apartment(222,'G',"Fairfax","Virginia");
		rh.townHouse(12249,"Vienna","Virginia");
		rh.customer("Mouni",123456789,"Drivers Licence");
		rh.takeLease("Town House");
		System.out.println("Amount:"+rh.payRent(5000));
		System.out.println("Lease :"+rh.newLease());

	}
}

Output

C:\Users\deept\Desktop\javaRohit>javac RentalHouse.java

C:\Users\deept\Desktop\javaRohit>java Resident
Renting for      1.Apartments 2.Town houses 3.Independent Houses
Apartment Building Number:111
Apartment Room number:405
City:Fairfax
State:Virginia
Apartment Building Number:222
Apartment Room number:G
City:Fairfax
State:Virginia
Town house Number :12249
City:Vienna
State:Virginia
Customer Name :Mouni
Phone number:123456789
Id Proof:Drivers Licence
Want to take a lease for :Town House
Deposit Amount is:5000
Amount:Deposit Paid
Lease :Approved
