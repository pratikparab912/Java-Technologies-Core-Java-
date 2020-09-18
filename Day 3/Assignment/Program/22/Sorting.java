import java.util.Scanner ;
class A 
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	int arr[] = new int[10] ;
	
	for ( int i=0 ; i < arr.length ; i ++ )
	{
	  System.out.print ( "Enter the number " +i+ " : " ) ;
	  arr[i] = scan.nextInt () ;
	}
	
	int temp = 0;
	for ( int a=0 ; a < arr.length ; a++ )
	{
	  for ( int j=0 ; j < arr.length ; j ++ )
	  {
	    if ( arr[a] > arr [j] )
		{
		  temp = arr[a] ;
		  arr[a] = arr[j] ;
		  arr[j] = temp ;
		}
	  }
	}
	
	for ( int k : arr )
	{
	  System.out.println ( k+ " " ) ;
	}

  }
}