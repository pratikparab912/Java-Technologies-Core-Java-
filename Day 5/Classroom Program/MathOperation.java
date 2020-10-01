class MathOperation
{
  static int sum ( int i , int j )
  {
    return i + j ;
  }
  static void show ( int result )
  {
    System.out.println ( result ) ;
  }
}

class A5
{
  static public void main ( String args [] )
  {
    int s = MathOperation.sum ( 12 , 13 ) ;
	
	System.out.println ( "\n=====Answer=====" ) ;
	
	MathOperation.show ( s ) ;
  }
}