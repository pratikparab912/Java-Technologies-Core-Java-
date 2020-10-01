class Outer
{
  void m1()
  {
    class A
	{
	  void m2()
	  {
	    System.out.println ( "Local class" ) ;
	  }
	}
	A r = new A () ;
	r.m2() ;
  }
}


class Demo4
{
  static public void main ( String args [] ) 
  {
    Outer o = new Outer () ;
	o.m1() ;
  }
}