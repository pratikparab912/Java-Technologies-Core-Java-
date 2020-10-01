class ArrayOpe
{
  static void showArray ( int arr[] )
  {
    for ( int a : arr )
	{
	  System.out.print ( " " +a ) ;
	}
	System.out.println ( " " ) ;
  }
}


class Demo7
{
  public static void main ( String args [] )
  {
    int a [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15} ;
	ArrayOpe.showArray (a) ;
  }
}