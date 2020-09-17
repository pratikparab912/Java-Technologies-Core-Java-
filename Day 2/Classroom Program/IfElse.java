import java.util.Scanner ;
class K 
{
  static public void main ( String args [] )
  {
   Scanner scan = new Scanner ( System.in ) ;
   
   System.out.println ( "Enter Any Number : " ) ;
   int num = scan.nextInt () ;
   
   if ( num % 2  ==  0 )
   {
     System.out.println ( num+ " is an even number" ) ;
   }
   else
   { 
     System.out.println ( num+ " is an odd number" ) ;
   }
  }
}