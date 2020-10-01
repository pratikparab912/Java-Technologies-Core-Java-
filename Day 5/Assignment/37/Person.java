import java.util.Scanner;

class Person
{
  int age;
  String name;
		
  Person ( )
  {
	age = 18 ;
  }
		
  void setData ( int age , String name )
  {
	this.age = age ;
	this.name = name ;
  }
		
  void display ( )
  {
    System.out.println ("Name: " +name) ;
	System.out.println ("Age: " +age) ;
  }
}

class PersonDemo
{
  public static void main ( String args [] )
  {
	Scanner scan=new Scanner ( System.in );
	
	System.out.print ( "Enter Name: " ) ;
	String name = scan.next ( ) ;
	
	System.out.print ( "Enter age: " ) ;
	int age=scan.nextInt ( ) ;
			
	Person P = new Person ( ) ;
	P.setData ( age , name ) ;
	
	System.out.println ( "\n" ) ;
	P.display ( ) ;
  }
}