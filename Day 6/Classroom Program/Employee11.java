class Person
{
  void getDetail ( )
  {
    System.out.println ( "Person Details" ) ;
  }
  void getJob ( )
  {
    System.out.println ( "Person Jon" ) ;
  }
}


class Employee extends Person
{
  void getJob ( )
  {
    System.out.println ( "Employee Job" ) ;
  }
  void getDept ( )
  {
    System.out.println ( "Employee Dept" ) ;
  }
}


class A
{
  static public void main ( String args [] )
  {
    Person p = new Person ( ) ;                  // Up Casting
	Employee e = ( Employee ) p ;                // Down 
	e.getDetail ( ) ;
	e.getJob ( ) ;
	e.getDept ( ) ;
  }
}