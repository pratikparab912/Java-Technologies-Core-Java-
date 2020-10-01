import java.util.Scanner;

class Product
{
  int pid , quantity ;
  float price;
		
  Product ( int pid , int quantity , float price )
  {
    this.pid = pid ;
	this.quantity = quantity ;
	this.price = price ;
  }
		
  static float total ( Product p[] )
  {
	Product test ;
	float sum = 0 ;
	
	for ( int i=0 ; i<p.length ; i++ )
	{
	  test = p[i] ;
	  sum = sum + ( test.quantity * test.price ) ;
	}
	return sum;
  }
}



class ProductDemo
{
  static public void main ( String args[] )
  {	
	Product p1 = new Product(1,2,1000) ;
	Product p2 = new Product(2,3,2000) ;
	Product p3 = new Product(3,4,3000) ;
	Product p4 = new Product(4,5,4000) ;
	Product p5 = new Product(5,6,5000) ;
	
	Product p[] = {p1,p2,p3,p4,p5};
	
	Product test;
	
	float price[] = new float[p.length] ;
			
			
	for ( int i=0; i<p.length; i++ )
	{
	  test = p[i] ;
	  price[i] = test.price ;
	}
			
	float max=0;
	
	for ( int i=0; i<price.length; i++ )
	{
	  if ( max < price[i] )
	  {
		max = max + price[i] ;
		price[i] = max-price[i] ;
		max = max-price[i];
	  }
	}
	System.out.println ( "\nHighest Price: " +max ) ;

	for(int i=0; i<p.length; i++)
	{
	  test = p[i];
	  if ( max == test.price)
	  {
	    System.out.println ( "\nPID Of Product With Highest Price: " +test.pid ) ;
	  }
	}
			
	float T = Product.total(p);
	System.out.println ( "\nTotal amount spent on the product: " +T ) ;			
  }
}