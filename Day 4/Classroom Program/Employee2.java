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

class EmployeeDemo2
{
  static public void main ( String args [] )
  {
    Employee e = new Employee ( ) ;
	e.set ( 101 , "Ram" ) ;
	e.show ( ) ;
	
	Employee e1 = new Employee ( ) ;
	e1.set ( 102 , "Shiv" ) ;
	e1.show ( ) ;
  }
}