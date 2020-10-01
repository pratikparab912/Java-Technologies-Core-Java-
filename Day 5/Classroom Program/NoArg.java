class Employee
{
  private int empId ;
  private String empName ;
  
  Employee ( ) 
  {
    System.out.println ( "No-arg" ) ;
	empId = 100 ;
	empName = "ABC" ;
  }
  
  void show ( )
  {
    System.out.println ( empId+ " " +empName ) ;
  }
}

class A9
{
  static public void main ( String args [] )
  {
    Employee e = new Employee ( ) ;
	e.show ( ) ;
  }
}