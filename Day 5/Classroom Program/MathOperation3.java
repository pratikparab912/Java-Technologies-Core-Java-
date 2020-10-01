class MathOperation3
{
  static void sum ( int i , float j )
  {
    float k = i + j ;
	System.out.println ( k ) ;
  }
 
  static void sum ( float i , int j ) 
  {
    float k = i + j ;
	System.out.println ( k ) ;
  }
}


class A8
{
  static public void main ( String args [] )
  {
    MathOperation3.sum ( 12 , 13.3f ) ;
	MathOperation3.sum ( 12.2f , 13 ) ;
  }
}