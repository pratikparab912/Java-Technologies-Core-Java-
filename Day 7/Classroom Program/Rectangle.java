import java.util.Scanner ;
abstract class Shape
{
  float area ;
  abstract void area ( ) ;
  
  void show ( )
  {
    System.out.print ( "Area = " +area ) ;
  }
}

class Rectangle extends Shape
{
  void area ( )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.print ( "\nEnter Length : " ) ;
	float length = scan.nextFloat() ;
	
	System.out.print ( "\nEnter Breadth : " ) ;
	float breadth = scan.nextFloat() ;
	
	area = length * breadth ;
  }
}

class ShapeDemo
{
	static public void main ( String args [] )
	{
	   Rectangle r = new Rectangle () ;
	   r.area ( ) ;
	   
	   System.out.println ( "\n" ) ;
	   r.show ( ) ;
	}
}
	
	