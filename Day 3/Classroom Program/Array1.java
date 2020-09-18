import java.util.Scanner ;
class D1
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
    int arr [] = new int [5] ;
	
	for ( int i = 0 ; i < arr.length ; i ++ )
	{
	  System.out.println ( "Enter Element" ) ;
	  arr [i] = scan.nextInt () ;
	}
	
	System.out.println ( "=====Answer=====" ) ;
	
	for ( int i = 0 ; i < arr.length ; i ++ )
	{
	  System.out.println ( arr [i] ) ;
	}
	
  }
}