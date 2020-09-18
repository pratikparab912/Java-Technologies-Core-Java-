import java.util.Scanner ;
class C1
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "Enter any number : " ) ;
	int num = scan.nextInt () ;
	
	System.out.println ( "=====Answer=====" ) ;
	while ( num < 10 )
	{
	  System.out.println ( num ) ;
	  num++ ;
	}
  }
}