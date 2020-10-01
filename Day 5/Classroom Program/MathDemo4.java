import java.util.Scanner ;
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


class A4
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	Employee arr[] = new Employee [3] ;
	
	for ( int i=0 ; i < arr.length ; i ++ )
	{
	  System.out.println ( "\nEnter Id : " ) ;
	  int empId = scan.nextInt ( ) ;
	  
	  System.out.println ( "Enter Name : " ) ;
	  String empName = scan.next ( ) ;
	  
	  Employee e = new Employee ( ) ;
	  e.set ( empId , empName ) ;
	  arr [i] = e ;
	}
	
	System.out.println ( "=====Answer=====" ) ;
	
	for ( Employee a : arr )
	{
	  a.show ( ) ;
	}
	
	System.out.println ( "================" ) ;
	arr[2].show ( ) ;
  }
}