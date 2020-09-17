import java.util.Scanner ;
class A1
{
  static public void main ( String args [] ) 
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "Enter First Number : " ) ;
	int n1 = scan.nextInt () ;
	
	System.out.println ( "Enter Second Number : " ) ;
	int n2 = scan.nextInt () ;
	
	System.out.println ( "Enter Third Number : " ) ;
	int n3 = scan.nextInt () ;
	
	if ( n1 > n2  &&  n1 > n3 )
	{
	  System.out.println ( "n1 is greatest" ) ;
	}
	else if ( n2 > n1  &&  n2 > n3 )
	{
	  System.out.println ( "n2 is greatest" ) ;
	}
	else
	{
	  System.out.println ( "n3 is greatest" ) ;
	}
  }
}