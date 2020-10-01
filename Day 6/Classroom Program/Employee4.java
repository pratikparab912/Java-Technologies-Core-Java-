class Person
{
  void show ( )
  {
    System.out.println ( "Person" ) ;
  }
}


class Employee extends Person 
{
  void show ( )
  {
    System.out.println ( "Employee" ) ;
  }
}


class Manager extends Employee
{
  void show ( )
  {
    System.out.println ( "Manager" ) ;
  }
}


class A
{
  static public void main ( String args [] )
  {
    Person p1 = new Person ( ) ;
	Person p2 = new Employee ( ) ;
	Person p3 = new Manager ( ) ;
	
	Person arr[] = { p3 , p2 , p1 } ;
	
	System.out.println ( "\n" ) ;
	
	for ( Person a : arr )
	{
	  a.show ( ) ;
	}
  }
}
