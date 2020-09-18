import java.util.Scanner ;
class A
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	int arr[] = new int[10] ;
	int sum = 0 ;
	
	for ( int i = 0 ; i < 10 ; i ++ )
	{
	  System.out.print ( "Enter the number" +i+ ":" ) ;
	  arr[i] = scan.nextInt() ;
	}
	
	for ( int j=0 ; j < 10 ; j ++ )
	{
	  sum = sum + arr[j] ;
	}
	
	float avg =sum / 10 ;
	
	System.out.println ( "Sum : " +sum ) ;
	System.out.println ( "Average : " +avg ) ;
  }
}