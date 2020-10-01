class Employee
{
  private int empId ;
  private String empName ;
  
  void set ( int id , String name ) 
  {
    empId = id ;
	empName = name ;
  }
  
  void show ( )
  {
    System.out.println ( empId+ " " +empName ) ;
  }
}

class EmployeeDemo1
{
  static public void main ( String args [] )
  {
    Employee e = new Employee ( ) ;
	e.set ( 101 , "Ram" ) ;
	e.show ( ) ;
  }
}