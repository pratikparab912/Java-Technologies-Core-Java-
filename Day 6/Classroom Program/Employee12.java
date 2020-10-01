class Person
{
  void getDetail ( )
  {
    System.out.println ( "Person Details" ) ;
  }
  void getJob ( )
  {
    System.out.println ( "Person Job" ) ;
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
    Person arr[] = { new Employee ( ) , new Employee ( ) } ;
	
	for ( Person a : arr )
	{
	  a.getJob ( ) ;
	}

    for ( Person a : arr )
	{
	  Employee e = ( Employee ) a ;
	  e.getDept ( ) ;
	}
  }
}