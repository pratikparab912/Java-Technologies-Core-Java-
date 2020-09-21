import java.util.Scanner;

class A
{
    public static void main( String args [ ] ) 
    {
        Scanner scan = new Scanner(System.in);
		
        System.out.print("\nEnter the number of elements in array : ");
        int n = scan.nextInt();
		
        int a [] = new int[n];
		
        System.out.println("\nEnter the elements of the array : ");
		
        for(int i = 0; i < n; i++)
        {
            a[i] = scan.nextInt();
        }
		
		int sumEven = 0 ;
		int sumOdd = 0 ;
		
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sumEven = sumEven + a[i];
            }
            else
            {
                sumOdd = sumOdd + a[i];
            }
        }
		
        System.out.println("\nSum of Even Numbers : " +sumEven);
        System.out.println("\nSum of Odd Numbers : " +sumOdd);
    }
}