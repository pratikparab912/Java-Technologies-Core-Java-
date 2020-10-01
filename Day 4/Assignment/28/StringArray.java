import java.util.Scanner ;
class A
{
    static public void main( String args [] )
	{
        Scanner scan = new Scanner(System.in);
        String arr[] = new String[5];

        System.out.println ( "\nEnter the name of City : " ) ;
		
        for (int i=0; i<arr.length ; i++)
		{
            arr[i] = scan.nextLine();
        }

        System.out.println ( "\n=====Answer=====" ) ;
		
        for(String p : arr)
		{
            System.out.println(" " +p);
        }

    } 
}