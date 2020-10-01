class Employee
{
  private int empId ;
  private String empName ;
  
  Employee ( )
  {
    this ( 100 , "ABC" ) ;
	System.out.println ( "No-Arg" ) ;
  }
  
  Employee ( int empId , String empName )
  {
	  this.empId = empId ;
	  this.empName = empName ;
	  System.out.println ( "Param Constr" ) ;
  }
  
  void show ( )
  {
    System.out.println ( empId+ " " +empName ) ;
  }
}

class A12
{
  static public void main ( String args [] ) 
  {
    Employee e = new Employee ( ) ;
	// e.show ( ) ;
  }
}