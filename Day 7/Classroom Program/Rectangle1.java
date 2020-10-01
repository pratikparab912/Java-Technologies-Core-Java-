import java.util.Scanner ;
interface Drawable
{
  // float PI = 3.14F ;
  static public final float PI = 3.14F ;
  // void draw ( ) ;
  public abstract void draw ( ) ;
}


abstract class Shape
{
  float area ;
  abstract void area () ;
  
  void show ()
  {
    System.out.println ( "Area = " +area ) ;
  }
}


class Rectangle extends Shape implements Drawable
{
  void area ( )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	System.out.print ( "\nEnter Length : " ) ;
	float length = scan.nextFloat() ;
	
	System.out.print ( "\nEnter breadth : " ) ;
	float breadth = scan.nextFloat() ;
	
	area = length * breadth ;
  }
  
  public void draw ()
  {
    System.out.print ( "\ndrawing rect" ) ;
  }
}

class ShapeDemo1
{
  static public void main ( String args [] )
  {
    Rectangle r = new Rectangle ( ) ;
	r.area() ;
	r.show() ;
	r.draw() ;
	
	System.out.println (Drawable.PI) ;
	// Drawable.PI = 3.14F ;
  }
}
	
	