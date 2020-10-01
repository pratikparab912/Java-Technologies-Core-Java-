class Student
{
    private int roll_No;
    private String name;
    private static int count;
	
    Student ( )
	{
      count++;
    }
	
    void setData ( int rn , String s_name )
	{
        this.roll_No = rn;
        this.name = s_name;
      
    }
	
    void showData( )
	{
        System.out.println ( "Roll No : " +roll_No ) ;
		System.out.println ( "Student Name : " +name ) ;
    }
	
    void countStudent ( )
	{
        System.out.println ( "Count of Student is : " +count ) ;
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

        System.out.println ( "\n" ) ;
        s1.countStudent();
    }
}