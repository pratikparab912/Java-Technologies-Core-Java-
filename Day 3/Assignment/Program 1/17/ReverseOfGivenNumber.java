import java.util.Scanner ;
class A
{
  static public void main ( String args [] )
  {
    int num , rev = 0 ;
	
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "Enter any number : " ) ;
	num = scan.nextInt() ;
	
	while ( num > 0 )
	{
	  rev = rev * 10 + num % 10 ;
	  num = num / 10 ;
	}
	
	System.out.println ( "Reverse Of A Given Number : " +rev ) ;
  }
}
	