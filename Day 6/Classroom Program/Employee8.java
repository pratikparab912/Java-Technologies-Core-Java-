class Person
{
  Person ( )
  {
    this ( 45 ) ;
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
    this ( 12 ) ;
	System.out.println ( "No-arg Employee" ) ;
  }
  
  Employee ( int i )
  {
    System.out.println ( "Parameter Employee" ) ;
  }
}


class A
{
  static public void main ( String args [] )
  {
    Employee e1 = new Employee ( ) ;
  }
}