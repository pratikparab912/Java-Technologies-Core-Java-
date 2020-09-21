class A
{
  static public void main ( String args [] )
  {
	int sum = 12 ;
	int a = 0 ;
	
	for ( int i = 1 ; i <= 10 ; i ++ )
	{
	  System.out.println ( sum ) ;
	  a = a + sum ;
	  sum = sum + 10 ;
	}
	
	System.out.println ( "Sum of the series is : " +a ) ;
  }
}