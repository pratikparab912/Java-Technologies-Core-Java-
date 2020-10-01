interface Foo
{
  default void m1()
  {
    System.out.println ( "default interface method" ) ;
  }
}


class Bar implements Foo
{

}


class Demo1
{
  static public void main ( String args [] )
  {
    Bar b = new Bar () ;
	b.m1() ;
  }
}