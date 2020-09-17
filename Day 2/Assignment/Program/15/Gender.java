import java.util.Scanner ;
class A
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "Enter Gender M/F : " ) ;
	char gender = scan.next().charAt(0);
	
	System.out.println ( "Enter the age : " ) ;
	int age = scan.nextInt () ;
	
	if ( gender == 'M'  &&  age > 21 )
	{
	  System.out.println ( "Eligible for marriage" ) ;
	}
	else if ( gender == 'F'  &&  age > 18 )
	{
	  System.out.println ( "Eligible for marriage" ) ;
	}
	else
	{
	  System.out.println ( "Not eligible for marriage" ) ;
	}
  }
}