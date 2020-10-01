class Outer
{
  int i = 100 ;
  
  class Foo
  {
    void m1()
	{
	  System.out.println ( "non static class" +i ) ;
	}
  }
}


class Demo3
{
  static public void main ( String args [] ) 
  {
    Outer r = new Outer () ;
	Outer.Foo ref = r.new Foo() ;
	ref.m1() ;
  }
}