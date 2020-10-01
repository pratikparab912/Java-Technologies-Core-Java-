class MathOperation1
{
  static void sum ( int i , int j )
  {
    int k = i + j ;
	System.out.println ( k ) ;
  }
  
  static void sum ( int i , int j , int p )
  {
    int k = i + j + p ;
	System.out.println ( k ) ;
  }
}

class A6
{
  static public void main ( String args [] )
  {
    MathOperation1.sum ( 12 , 13 ) ;
	MathOperation1.sum ( 12 , 13 , 14 ) ;
  }
}