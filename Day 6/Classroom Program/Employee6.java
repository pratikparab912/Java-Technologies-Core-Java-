class Person
{
 
   Person ( )
   {
     System.out.println ( "No-arg Person" ) ;
   }

   Person ( int i )
   {
     System.out.println ( "Param Person" ) ;
   }
}


class Employee extends Person
{
  Employee ( )
  {
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
    Employee e = new Employee ( ) ;
	Employee e1 = new Employee ( 12 ) ;
  }
}