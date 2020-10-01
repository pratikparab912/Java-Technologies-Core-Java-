class Student
{
	private int roll_No ;
	private String name ;
	
	void setData(int rn , String s_name)
	{
		roll_No = rn ;
		name = s_name;
	}
	
	void showData ( )
	{
		System.out.println ( "Roll No : " +roll_No ) ;
		System.out.println ( "Student Name : " +name ) ;
	}
}

class StudentDemo
{
	public static void main ( String args [] )
	{
		System.out.print ( "\n" ) ;
		Student s1 = new Student ( ) ;
		s1.setData ( 43 , "Pratik" ) ;
		s1.showData ( ) ;
		
		System.out.println ( "\n" ) ;
		Student s2 = new Student ( ) ;
		s2.setData ( 44 , "Abhijeet" );
		s2.showData ( ) ;
	}
}