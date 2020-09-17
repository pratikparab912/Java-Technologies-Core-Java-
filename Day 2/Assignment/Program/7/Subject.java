import java.util.Scanner ;
class A
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "Enter the marks of five subject : " ) ;
	
	int marathi = scan.nextInt () ;
	int english = scan.nextInt () ;
	int maths   = scan.nextInt () ;
	int science = scan.nextInt () ;
	int social  = scan.nextInt () ;
	
	float sum = marathi + english + maths + science + social ;
	System.out.println ( "Sum of five subject : " +sum ) ;
	
	float percentage = (sum / 500) * 100 ;
	System.out.println ( "Percentage of five subject : " +percentage ) ;
  }
}