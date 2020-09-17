import java.util.Scanner ;
class A
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "Degree in fahrenheit : " ) ;
	double f = scan.nextDouble () ;
	
	double c = ( 5*(f-32) / 9 ) ;
	System.out.println ( "Degree in Celcius : " +c );
  }
}