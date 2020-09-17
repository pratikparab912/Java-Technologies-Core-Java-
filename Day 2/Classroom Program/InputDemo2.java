import java.util.Scanner ;
class H
{
  static public void main ( String args [] ) 
  {
    Scanner scan = new Scanner ( "123 321" ) ;
	int i = scan.nextInt () ;
	int j = scan.nextInt () ;
	
	int k = i + j ;
	System.out.println ( "Sum = " +k ) ;
  }
}