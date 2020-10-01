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


class Manager extends Employee
{
  private int ta ;
  private int da ;
  
  void set ( int empId , String empName , int ta , int da )
  {
    set ( empId , empName ) ;
	this.ta = ta ;
	this.da = da ;
  }
  
  void show ( ) 
  {
    super.show ( ) ;
	System.out.println ( ta+ " " +da ) ;
  }
}


class Clerk extends Employee
{
  private int hra ;
  
  void set ( int empId , String empName , int hra ) 
  {
    set ( empId , empName ) ;
	this.hra = hra ;
  }
 
  void show ( ) 
  {
    super.show ( ) ;
	System.out.println ( hra ) ;
  }
}


class A
{
  static public void main ( String args [] )
  {
	System.out.println ( "\n" ) ;
	
    Manager m = new Manager ( ) ;
	m.set ( 101 , "Ram" , 9000 , 600 ) ;
	m.show ( ) ;
	
	System.out.println ( "\n" ) ;
	
	Clerk c = new Clerk ( ) ;
	c.set ( 102 , "Shiv" , 9999 ) ;
	c.show ( ) ;
  }
}
   