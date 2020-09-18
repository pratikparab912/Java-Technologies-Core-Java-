import java.util.Scanner ;
class A
{
  static public void main ( String args [] ) 
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	int arr[] = new int[10] ;
	
	for ( int i=0 ; i < arr.length ; i++ )
	{
	  System.out.print ( "Enter the number " +i+ " : " ) ;
	  arr[i] = scan.nextInt() ;
	}
	
	int sum = 0 ;
	int sum1 = 0 ;
	
	for ( int j=0; j<arr.length ; j++ )
	{
	  if ( arr[j] % 2   ==   0 )
	  {
	    sum=sum+arr[j] ;
	  }
	  else
	  {
	    sum1=sum1+arr[j] ;
	  }
	}
	
	System.out.println ( "Sum of even number is : " +sum ) ;
	System.out.println ( "Sum of odd number is : " +sum1 ) ;
  }
}