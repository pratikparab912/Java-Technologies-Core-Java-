import java.util.Scanner ;
class A 
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "Enter Ten Numbers : " ) ;
	int arr[] = new int[10] ;
	
	for ( int i=0 ; i < arr.length ; i ++ )
	{
	  arr[i] = scan.nextInt () ;
	}
	
	int temp = 0;
	
	for ( int j=0 ; j < arr.length ; j++ )
	{
	  for ( int k=0 ; k < arr.length ; k++ )
	  {
	    if ( arr[j] > arr [k] )
		{
		  temp = arr[j] ;
		  arr[j] = arr[k] ;
		  arr[k] = temp ;
		}
	  }
	}
	
	System.out.println ( "\nSorted Array In Descending Order : " ) ;
	
	for ( int e : arr )
	{
	  System.out.println ( e+ " " ) ;
	}

  }
}