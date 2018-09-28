class Clasroom
{
	
void courses()
{
	System.out.println("1.Access Control  2.Telecommunications  3.Network Security  4.Information Security and Risk management");
}
void requestCourses(String semester)
	{
	System.out.println("Request for:"+semester);
	}
String register(String mainCourse,String onlineCourse)
{
	System.out.println("Fall Semester (Main):"+mainCourse);
	System.out.println("Fall Semester (Online):"+onlineCourse);
	return "Registered";
}
String requestProfesor(String professor)
	{
	System.out.println("Professor:"+professor);
	return "Approved";
	}
String fee(int term1,int term2)
	{
		System.out.println("Term 1 Fee :"+term1);
		System.out.println("Term 2 Fee :"+term2);
		return "Fee Paid";
	}

}

class Room
{
	public static void main(String[] args) 
	{
		Classroom Uc=new Classroom();
		Uc.courses();
		Uc.requestCourses("Fall Semester");
		System.out.println("Registration Status:"+Uc.register("Access Control","Network Security"));
		System.out.println("Professor acknowledgement Status:"+Uc.requestProfesor("Pittman"));
		System.out.println("Fee Status :"+Uc.fee(1700,1400));
		
	}
}

