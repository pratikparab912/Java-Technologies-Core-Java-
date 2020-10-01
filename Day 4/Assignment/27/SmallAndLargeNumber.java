import java.util.Scanner ;

class A
{
  static public void main (String args [] )
  {
    int large,small;
	
    Scanner scan = new Scanner(System.in); 

    System.out.println("\nEnter number of elements : ");
    int n = scan.nextInt();
    int arr[]=new int[n];

    System.out.println("\nEnter elements of Array : ");
    
	for(int i=0 ; i<n ; i++ )
	{
      arr[i]=scan.nextInt();
	}

    large=small=arr[0];
	
    for(int i=1 ; i<n ; i++ )
    {
      if ( arr[i] > large )
	  {
       large=arr[i];
	  }
      else
	  {
      small=arr[i];
	  }
    }

     System.out.println("\nSmallest Element is : " +small);
	 
     System.out.println("\nLargest Element is : " +large);
  }
}