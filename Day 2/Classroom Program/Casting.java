class C
{
  public static void main ( String args [] ) 
  {
    byte b = 12 ;
	int i = b ;                                     // Up Casting
	System.out.println ( i ) ;
	
	int j = 34 ;
	byte b1 = ( byte ) j ;                         // Down Casting
	System.out.println ( b1 ) ;
  }
}