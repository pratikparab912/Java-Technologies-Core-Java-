class Employee
{
  private int empId ;
  private String empName ;
  
  void set ( int empId , String empName )
  {
    this.empId = empId ;
	this.empName = empName ;
  }
  
  void show ( ) 
  {
    System.out.println ( empId+ " " +empName ) ;
  }
}
  
  
class A1
{
	static public void main ( String args[] ) 
	{
		Employee e = new Employee ( ) ;
		e.set ( 101 , "Ram" ) ;
		e.show ( ) ;
	}
}
