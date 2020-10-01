import java.util.Scanner;

class Employee
{
  static int empno = 0 ;
  static float salary = 0 ;
		
  Employee ( int salary )
  {
	empno++ ;
	this.salary = this.salary + salary ;
  }
		
  void display()
  {
	System.out.print ( "\nTotal employees : " +empno ) ;
	
	System.out.print ( "\n" ) ;
	
	System.out.print ( "\nTotal salary : " +salary ) ;
	
	System.out.print ( "\n" ) ;
  }
}



class EmployeeDemo
{
  static public void main ( String args [] )
  {
	Employee e1 = new Employee(14000);
	Employee e2 = new Employee(10000);
	Employee e3 = new Employee(16000);
	Employee e4 = new Employee(12000);
	e1.display();
  }
}