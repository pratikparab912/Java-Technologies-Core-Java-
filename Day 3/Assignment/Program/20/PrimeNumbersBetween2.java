import java.util.Scanner ;
class A
{
  static public void main ( String args [] ) 
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	int m = 5 ;
	byte flag = 1 ;
	int n = 7 ;
	
	for ( int j = m ; j <= n ; j ++ )
	{
	  for ( int i = 2 ; i < m ; i ++ )
	  {
	    if ( j % i  ==  0 )
		{
		  flag = 0 ;
		  break ;
		}
		flag=1;
	  }
	  if ( flag == 1 )
	  {
	    System.out.println ( j ) ;
	  }
	}
   }
}