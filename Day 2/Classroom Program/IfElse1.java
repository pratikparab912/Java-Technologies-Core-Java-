import java.util.Scanner ;
class L
{
  static public void main ( String args [] ) 
  {
   Scanner scan = new Scanner ( System.in ) ;
   
   System.out.println ( "Enter 0 Or 1" ) ;
   int num = scan.nextInt ( ) ;
   
   if ( num == 0  ||  num == 1 )
   {
     System.out.println ( "Good" ) ;
   }
   else
   {
     System.out.println ( "Try Again" ) ;
   }
  }
}