class A
{
  static public void main ( String args [] ) 
  {
    int x = 2 ;
	int y = (x*x) + (3*x) - 7 ;
	System.out.println ( "Value Of y : " +y ) ;
	
	int b = x++ + ++x ;
	System.out.println ( "Value Of x : " +x ) ;
	System.out.println ( "Value Of b : " +b ) ;
	
	int z = x++ - --y - --x + x++ ;
	System.out.println ( "Value Of x : " +x ) ;
	System.out.println ( "Value Of y : " +y ) ;
	System.out.println ( "Value Of z : " +z ) ;
	
	boolean p = true ;
	boolean q = false ;
	boolean r = p && q || !(p || q) ;
	System.out.println ( "Value Of p : " +p ) ;
	System.out.println ( "Value Of q : " +q ) ;
	System.out.println ( "Value Of r : " +r ) ;
  }
}