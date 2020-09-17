import java.util.Scanner ;
class A
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "==========Before Swap==========" ) ;
	
	System.out.println ( "Enter Value Of a : " ) ;
	int a = scan.nextInt () ;
	
	System.out.println ( "Enter Value Of b : " ) ;
	int b = scan.nextInt () ;
	
	a = a * b ;
	b = a / b ;
	a = a / b ;
	
	System.out.println ( "==========After Swap==========" ) ;
	
	System.out.println ( "Value Of a : " +a ) ;
	System.out.println ( "Value Of b : " +b ) ;
  }
}