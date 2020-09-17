import java.util.Scanner ;
class A
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "Enter Principle Amount : " ) ;
	double principle = scan.nextDouble () ;
	
	System.out.println ( "Enter Rate Of Interest : " ) ;
	double rate = scan.nextDouble () ;
	
	System.out.println ( "Enter Time Given For Simple Interest : " ) ;
	double time = scan.nextDouble () ;
	
	double si = ( principle * rate * time ) / 100 ;
	System.out.println ( "Simple Interest : " +si ) ;
  }
}