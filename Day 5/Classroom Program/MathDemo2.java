class Employee
{
  private int empId ;
  private String empName ;
  
  void set ( int empId , String empName )
  {
    System.out.println ( "this = " +this ) ;
    this.empId = empId ;
	this.empName = empName ;
  }
  
  void show ( )
  {
    System.out.println ( empId+ " " +empName ) ;
  }
}


class A2
{
  static public void main ( String args [] )
  {
    Employee e = new Employee ( ) ;
	System.out.println ( "e = " +e ) ;
	e.set ( 101 , "Ram" ) ;
	e.show ( ) ;
	
	Employee e1 = new Employee ( ) ;
	System.out.println ( "\ne1 = " +e1 ) ;
	e1.set ( 102 , "Shiv" ) ;
	e1.show ( ) ;
  }
}