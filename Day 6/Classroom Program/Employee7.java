class Person 
{
  Person ( )
  {
    System.out.println ( "No-arg Person" ) ;
  }
  Person ( int i )
  {
    System.out.println ( "Parameter Person" ) ;
  }
}


class Employee extends Person
{
  Employee ( )
  {
    // super ( 12 ) ;
	System.out.println ( "No-arg Employee" ) ;
  }
  Employee ( int i )
  {
    super ( i ) ;
	System.out.println ( "Parameter Employee" ) ;
  }
}


class A
{
  static public void main ( String args [] ) 
  {
    Employee e = new Employee ( ) ;
	Employee e1 = new Employee ( 12 ) ;
  }
}