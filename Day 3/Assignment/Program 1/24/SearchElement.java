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
	  arr[i] = scan.nextInt();
	}
	
	int flag ;
	flag = 1 ;
	
	System.out.print ( "\nEnter Number for find : " ) ;
	int num = scan.nextInt() ;
	
	for ( int j = 0 ; j < arr.length ; j ++ )
	{
	  if ( arr[j] == num )
	  {
	    flag = j ;
		break ;
	  }
	}
	
	if ( flag == 1 )
	{
	  System.out.println ( "\nNumber not found" ) ;
	}
	else
	{
	  System.out.println ("\nNumber found at index : "+flag+""  ) ;
	}
  }
}