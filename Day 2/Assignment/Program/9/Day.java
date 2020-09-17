import java.util.Scanner ;
class A
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "Enter Days : " ) ;
	int num = scan.nextInt () ;
	
	int years = num / 365 ;
	int months = num / 30 ;
	int days = num / 1 ;
	
	if ( months >= 12 )
	{
		months = months - 12*years ;
	}
	System.out.println ( +years+ " year and " +months+ " months") ;
	
	if ( days >= 365 )
	{
		days = days - 365*years ;
	}
	System.out.println ( +years+ " year and " +days+ " days") ;
  }
}