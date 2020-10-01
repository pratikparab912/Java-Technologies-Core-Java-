import java.util.Scanner;

class MathOperation
{
  void multiply ( int a , int b )
  {
	int r = a * b ;
	System.out.print ( "Multiplication1 : " +r );
  }
  
  void multiply ( float c , float d , float e )
  {
    float r = c * d * e ;
	System.out.print ( "Multiplication2 : " +r ) ;
  }	
  
  
  void multiply (int arr [] )
  {
    int r = 1 ;
			
	for(int x:arr)
	{
	  r = r * x ;
	}
	
	System.out.print ( "Multiplication3: " +r ) ;
  }	

  
  void multiply ( double a , int b )
  {
    double r = a * b ;
	System.out.print ( "Multiplication1: " +r ) ;
  }
}



class A
{
  public static void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	int arr[] = new int[5] ;
	MathOperation M1 = new MathOperation ( ) ;
			
	System.out.println ( "Enter two integers: " ) ;
	int a = scan.nextInt();
	int b=scan.nextInt();
	M1.multiply(a,b);
		
    System.out.print ( "\n" ) ;
	
	System.out.println ( "\nEnter three decimals: " ) ;
	float c=scan.nextFloat();
	float d=scan.nextFloat();
	float e=scan.nextFloat();
	M1.multiply(c,d,e);
			
	System.out.print ( "\n" ) ;
	
	System.out.println ( "\nEnter 5 integers: " ) ;
	for(int i=0; i<arr.length; i++)
	{
	  arr[i]=scan.nextInt();
	}
	M1.multiply(arr);
		
    System.out.print ( "\n" ) ;
	
	System.out.println("\nEnter one decimal and one integer: ");
	double r=scan.nextDouble();
	int s=scan.nextInt();
	M1.multiply(r,s);
  }
}