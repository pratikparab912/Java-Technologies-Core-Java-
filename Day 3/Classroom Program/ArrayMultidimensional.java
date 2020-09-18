class D6
{
  static public void main ( String args [] )
  {
    int a[] = new int[] { 1,2,3 }  ;              // int a[] = { 1,2,3 }
	int b[] = new int[] { 4,5,6 }  ;              // int b[] = { 4,5,6 }
	int c[] = new int[] { 7,8,9 }  ;              // int c[] = { 7,8,9 }
	
	int arr[][] = new int[3][] ;
	
	arr[0] = a ;
	arr[1] = b ;
	arr[2] = c ;
	
	System.out.println ( "=====Answer=====" ) ;
	
	for ( int i = 0 ; i < arr.length ; i ++ )
	{
	  for ( int j = 0 ; j < arr.length ; j ++ )
	  {
	    System.out.print ( " " +arr[i][j] ) ;
	  }
	  System.out.println ( " " ) ;
	}

  }
}