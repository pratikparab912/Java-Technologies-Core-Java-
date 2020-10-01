class Outer
{
  static class Foo
  {
    void m1()
	{
	  System.out.println ( "Static class" ) ;
	}
  }
}


class Demo2
{
  static public void main ( String args [] )
  {
    Outer.Foo ref = new Outer.Foo() ;
  }
}