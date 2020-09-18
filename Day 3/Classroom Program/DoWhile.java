import java.util.Scanner ;
class C2
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "Enter any number : " ) ;
	int num = scan.nextInt () ;
	
	System.out.println ( "=====Answer=====" ) ;
	do
	{
	  System.out.println ( num ) ;
	  num++ ;
	}
	while ( num < 10 ) ;
	
  }
}