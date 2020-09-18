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
	  arr[i] = scan.nextInt();
	}
	int flag ;
	flag = 1 ;
	
	System.out.print ( "Enter Number for find : " ) ;
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
	  System.out.println ( "Number not found" ) ;
	}
	else
	{
	  System.out.println ( "Number found at index "+flag+" : " +num ) ;
	}
	
  }
}