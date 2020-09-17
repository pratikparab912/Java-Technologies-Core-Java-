import java.util.Scanner ;
class A
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	double pi = 3.1416 ;
	
	System.out.println ( "Enter the radius of a circle : " ) ;
	double radius = scan.nextDouble ( ) ;
	
	double area = pi * radius * radius ;
	System.out.println ( "Area Of Circle : " +area ) ;
	
	double circumference = 2 * pi * radius ;
	System.out.println ( "Circumference Of Circle : " +circumference ) ;
  }
}