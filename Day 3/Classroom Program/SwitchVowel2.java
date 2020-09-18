import java.util.Scanner ;
class A4
{
  static public void main ( String args [] ) 
  {
    Scanner scan = new Scanner ( System.in ) ;
	 
	System.out.println ( "Enter Any Character : " ) ;
	char ch = scan.next().charAt(0) ;
	
	switch ( ch )
	{
	  case 'a' :
	  case 'e' :
	  case 'i' :
	  case 'o' :
	  case 'u' :
	    
		System.out.println ( ch+ " is a lower vowel" ) ;
		break ;
		
		
	 case 'A' :
	 case 'E' :
	 case 'I' :
	 case 'O' :
	 case 'U' :
	 
	   System.out.println ( ch+ " ia a upper vowel" ) ;
	   break ;
	   
	   
	 default :
	   System.out.println ( "Not a vowel" ) ;
	   break ;
	}
  }
}
	 