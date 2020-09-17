import java.util.Scanner ;
class G
{
  static public void main ( String args [] ) 
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.println ( "Enter First Number : " ) ;
	int i = scan.nextInt ( ) ;
	
	System.out.println ( "Enter Second Number : " ) ;
	int j = scan.nextInt ( ) ;
	
	int k = i + j ;
	System.out.println ( "Sum = " +k ) ;
  }
}