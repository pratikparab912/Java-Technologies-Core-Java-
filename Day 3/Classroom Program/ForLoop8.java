class B8
{
  static public void main ( String args [] )
  {
    outer :
	
	for ( int i=1 ; i<=5 ; i++ )
	{
	  for ( int j=1 ; j<=5 ; j++ )
	  {
	    System.out.print ( " " +j ) ;
		
		if ( i == 3 )
		break outer ;
	  }
	  System.out.println ( " " ) ;
	}
  }
}