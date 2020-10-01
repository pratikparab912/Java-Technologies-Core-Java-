import java.util.Scanner ;

class A
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
    int arr[][] = new int [2][2] ;
	
	for ( int i = 0 ; i < arr.length ; i++ )
	{
	  for ( int j = 0 ; j < arr[i].length ; j++ )
	  {
	    System.out.print ( "Enter Element : " ) ;
		arr[i][j] = scan.nextInt() ;
	  }
	}
	
	System.out.println ( "=====Answer=====" ) ;
	
	for ( int ar[] : arr )
	{
	  for ( int e : ar )
	  {
	    System.out.print ( " " +e ) ;
	  }
	  System.out.println ( " " ) ;
	}
  }
}