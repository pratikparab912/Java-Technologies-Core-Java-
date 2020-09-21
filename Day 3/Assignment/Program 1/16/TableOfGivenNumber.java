import java.util.Scanner ;
class A
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "Enter any number : " ) ;
	int num = scan.nextInt() ;
	
	System.out.println ( "====Table Of Given Number====") ;
	
	for ( int i = 1 ; i <= 10 ; i ++ )
	{
	  System.out.println ( num+ " * " +i+ " = " +num*i ) ;
	}
	
  }
}