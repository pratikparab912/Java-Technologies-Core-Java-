class MathOperation1
{
  static void sum ( int i , int j )
  {
    int k = i + j ;
	System.out.println ( k ) ;
  }
  
  static void sum ( float i , float j )
  {
    float k = i + j ;
	System.out.println ( k ) ;
  }
}


class A7
{
  static public void main ( String args [] )
  {
    MathOperation1.sum ( 12 , 13 ) ;
	MathOperation1.sum ( 12.2f , 13.3f ) ;
  }
}