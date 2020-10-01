import java.util.Scanner;

class Circle
{
  float r;
  float a;
		
  void init ( float r )
  {
	this.r = r ;
  }
		
  void calculateArea()
  {
	a = 3.1416F * r * r ;
  }
		
  void display ( )
  {
	System.out.println ( "Radius: " +r );
	System.out.println ( "Area: " +a );
  }
}


class CircleDemo
{
  public static void main ( String args [] )
  {
	Scanner scan = new Scanner ( System.in );
	
	System.out.print ("\nEnter Radius: " ) ;
	float r=scan.nextFloat();
	
	System.out.print ( "\n" ) ;
	
	Circle c = new Circle ( ) ;
	c.init ( r );
	c.calculateArea ( ) ;
	c.display ( ) ;
  }
}