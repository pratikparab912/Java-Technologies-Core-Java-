class Employee
{
  private int empId ;
  private String empName ;
  
  void show ( ) ;
  {
    System.out.println ( empId+ " " +empName ) ;
  }
}


class A11
{
  static public void main ( String args [] )
  {
    Employee e = new Employee ( ) ;
	e.show ( ) ;
  }
}