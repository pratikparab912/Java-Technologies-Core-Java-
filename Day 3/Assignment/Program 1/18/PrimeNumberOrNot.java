import java.util.Scanner ;
class A
{
  static public void main ( String args [] )
  {
    int num , flag = 0 ;
	
	Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "Enter any number to check whether prime number or not : " ) ;
	num = scan.nextInt() ;
	
	for ( int i = 2 ; i <= num/2 ; i ++ )
	{
	  if ( num % i  ==  0 )
	  {
	    System.out.println ( "Number is not prime" ) ;
		flag = 1 ;
		break;
	  }
	}
	if ( flag == 0 )
	{
	  System.out.println ( "Number is prime" ) ;
	}
	
  }
}