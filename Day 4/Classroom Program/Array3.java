class A 
{
  static public void main ( String args [] )
  {
    int arr1[][] = new int[2][] ;
	int arr2[][] = new int[2][3] ;
	
	System.out.println ( "\n+++++Answer+++++" ) ;
	
	for ( int ar[] : arr1 )
	{
	  System.out.print ( " " +ar ) ;
	}
	
	System.out.println ( "\n====================" ) ;
	
	System.out.println ( "\n+++++Answer+++++" ) ;
	
	for ( int arr[] : arr2 )
	{
	  System.out.print ( " " +arr ) ;
	}
	
  }
}
	
	