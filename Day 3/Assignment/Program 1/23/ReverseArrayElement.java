import java.util.Scanner ;
class A
{
  static public void main ( String args [] ) 
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "Enter Elements : " ) ;
	int arr[] = new int[5] ;
	
	for ( int i = 0 ; i < arr.length ; i ++ )
	{
	  
	  arr[i] = scan.nextInt ( );
	}
	
	int arr1[] = new int[5] ;
	
	for (int j=0,k=4;j<arr.length;j++,k--)
	{
	  arr1[k] = arr[j] ;
	}
	
	System.out.println ( "\n=====Answer=====" ) ;
	
	for ( int m : arr1 )
	{
	  System.out.println (m+ " " ) ;
	}
  }
}