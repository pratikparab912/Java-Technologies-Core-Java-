import java.util.Scanner ;
class A2
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
	
	int temp = n1 > n2  ?  n1 : n2 ;
	int result = n3 > temp  ?  n3 : temp ;
	System.out.println ( "Largest Number : " +result ) ;
  }
}