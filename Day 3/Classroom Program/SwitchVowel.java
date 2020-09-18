import java.util.Scanner ;
class A2
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	 
	System.out.println ( "Enter Any Character : " ) ;
	char ch = scan.next().charAt(0) ;
	
	switch ( ch ) 
	{
	  case 'a' :
	    System.out.println ( ch+ " is a vowel" ) ;
		break ;
		
	  case 'e' :
	    System.out.println ( ch+ " is a vowel" ) ;
		break ;
		
	  case 'i' :
	    System.out.println ( ch+ " is a vowel" ) ;
		break ;
		
	  case 'o' :
	    System.out.println ( ch+ " is a vowel" ) ;
		break ;
		
	  case 'u' :
	    System.out.println ( ch+ " is a vowel" ) ;
		break ;
		
	  default :
	    System.out.println ( "Not a vowel" ) ;
	}
  }
}