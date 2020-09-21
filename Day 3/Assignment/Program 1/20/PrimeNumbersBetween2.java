import java.util.Scanner ;

class A
{
    static public void main( String args [] ) 
	{
		Scanner scan = new Scanner( System.in ) ;
		
		System.out.println ( "Enter Lower Bound Number : " ) ;
		int l = scan.nextInt ( ) ;
		
		System.out.println ( "Enter Upper Bound Number : " ) ;
		int u = scan.nextInt ( ) ;
		
		
        while (l < u) 
		{
            boolean flag = false;

            for(int i = 2; i <= l/2; ++i) 
			{
                
                if(l % i == 0) 
				{
                    flag = true;
                    break;
                }
            }

            if (!flag && l != 0 && l != 1)
                System.out.print(l + " ");

            l++;
        }
    }
}