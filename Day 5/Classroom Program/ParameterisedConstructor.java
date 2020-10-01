class Employee
{
  private int empId ;
  private String empName ;
  
  Employee ( int empId , String empName )
  {
    System.out.println ( "Param Constr" ) ;
	this.empId = empId ;
	this.empName = empName ;
  }
  
  void show ( ) 
  {
    System.out.println ( empId+ " " +empName ) ;
  }
}


class A10
{
  static public void main ( String args [] ) 
  {
    Employee e1 = new Employee ( 101 , "Ram" ) ;
	e1.show ( ) ;
  }
}