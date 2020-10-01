import java.util.Scanner ;

class A
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "Enter Rows : " ) ;
	int r = scan.nextInt () ;
	
	int arr[] = new int[r][] ;
	
	for ( int i = 0 ; i < arr.length ; i++ )
	{
	  System.out.println ( "Enter Column for " +i ) ;
	  
	  int cols = scan.nextInt() ;
	  arr[i] = new int[cols] ;
	  
	  for ( int j = 0 ; j < arr[i].length ; j++ )
	  {
	    System.out.println ( "Enter Element : " ) ;
		arr[i][j] = scan.nextInt() ;
	  }
	}
	
	System.out.println ( "=====Answer=====" ) ;
	
	for ( int ar[] : arr )
	{
	  for ( int a : ar )
	  {
	    System.out.print ( " " +a ) ;
	  }
	  System.out.println ( " " ) ;
	}
  }
}