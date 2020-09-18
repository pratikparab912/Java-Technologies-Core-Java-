import java.util.Scanner ;
class A
{
  static public void main ( String args [] ) 
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	int arr[] = new int[10] ;
	
	for ( int i = 0 ; i < arr.length ; i ++ )
	{
	  System.out.print ( "Enter the number " +i+ " : " ) ;
	  arr[i] = scan.nextInt ( );
	}
	
	int arr1[] = new int[10] ;
	for (int j=0,k=9;j<arr.length;j++,k--)
	{
	  arr1[k] = arr[j] ;
	}
	for ( int m : arr1 )
	{
	  System.out.println (m+ " " ) ;
	}
  }
}