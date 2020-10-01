class Employee
{
  private int empId ;
  private String empName ;
	
  void set ( int empId , String empName )
  {
    System.out.println ("this : " +this ) ;
	
    this.empId = empId ;
    this.empName = empName ;
  }
  void show ( )
  {
    // System.out.println ( "this : " +this ) ;
    System.out.println ( "Employee Id : " +empId ) ;
	System.out.println ( "Employee Name : " +empName ) ;
  }

}

class A
{
  public static void main ( String args [] )
  {
    Employee e = new Employee ( ) ;
    System.out.println( "e : " +e ) ;
    e.set (43 , "Pratik") ;
    e.show ( ) ;

    Employee  e1 = new Employee ( ) ;
    System.out.println ( "\ne : " +e1 ) ;
    e1.set ( 44 , "Abhijeet" ) ;
    e1.show ( ) ;
	
	System.out.println ( "\n" ) ;
    e.show ( ) ;
  }
}