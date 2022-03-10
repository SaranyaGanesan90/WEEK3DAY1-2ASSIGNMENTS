package overloading;

public class Students {

	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student ID"+ id + "Name" + name);
		
		
		
	
	}
	
	public void getStudentInfo(String email,long phonenumber)
	{
		System.out.println("Student Email"+ email + "Student Phone Number" + phonenumber);
	
	
	
	}
	
		public static void main(String[] args) {
		
	
	
	

Students std=new Students();
std.getStudentInfo(45, "Saran");
std.getStudentInfo("saranya@gmail.com", 123456789);
}

}
