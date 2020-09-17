import java.util.Scanner ;
class A
{
  static public void main ( String args [] )
  {
    Scanner scan = new Scanner ( System.in ) ;
	
	double basic, gs, house_rent_allowance, dearness_allowance ;
	System.out.println ( "Enter Basic Salary : " ) ;
	basic = scan.nextDouble () ;
	
	if ( basic < 10000 )
	{
	  house_rent_allowance = 0.1 * basic ;
	  dearness_allowance  = 0.9 * basic ;
	}
	else
	{
	  house_rent_allowance = 2000 ;
	  dearness_allowance  = 0.98 * basic ;
	}
	
	gs = basic + house_rent_allowance + dearness_allowance ;
	System.out.println ( "Gross Salary : " +gs ) ;
  }
}