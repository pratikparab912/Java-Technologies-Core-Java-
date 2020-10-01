interface Foo
{
  static void m1()
  {
    System.out.println ( "Static interface method" ) ;
  }
}


class Demo
{
  static public void main ( String args [] )
  {
    Foo.m1() ;
  }
}

