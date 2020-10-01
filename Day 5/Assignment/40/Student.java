import java.util.Scanner;

class Student
{
  int roll_no , age ;
  float score ;
  String name ;
		
  Student ( int roll_no , String name , int age , float score )
  {
	this.roll_no = roll_no ;
	this.name = name ;
	this.age = age ;
	this.score = score ;
  }
}

class StudentDemo
{
  static public void main ( String args [] )
  {	
    int roll_no , age ;
	float score ;
	String name ;
	
	Scanner scan = new Scanner ( System.in ) ;
	
	Student s[]=new Student[4];
	Student test;
			
	for(int i=0; i<4; i++)
	{
	  System.out.print ( "\nEnter Roll Number : " );
	  roll_no = scan.nextInt() ;
	  
	  System.out.print ( "Enter Name : " ) ;
	  name = scan.next() ;
	  
	  System.out.print ( "Enter Age : ") ;
	  age = scan.nextInt() ;
	  
	  System.out.print ( "Enter Score : " ) ;
	  score = scan.nextFloat() ;
				
	  Student s1 = new Student(roll_no,name,age,score) ;
	  s[i]=s1;
				
	}
			
	System.out.println("\nStudents who scored between [80-100]: ");
	for(int i=0; i<4; i++)
	{
	  if(s[i].score>=80 && s[i].score<=100)
	  {
	    System.out.print ( "Roll Number : " +s[i].roll_no ) ;
		System.out.print ( "\nName : " +s[i].name ) ;
		System.out.print ( "\nAge : " +s[i].age ) ;
		System.out.print ( "\nScore : " +s[i].score ) ;
	  }
	}
		
    System.out.print ( "\n" ) ;		
	System.out.println("\nStudents who scored between [65-80]: ");
	for(int i=0; i<4; i++)
	{
	  if(s[i].score>=65 && s[i].score<80)
	  {
	    System.out.print ( "Roll Number : " +s[i].roll_no ) ;
		System.out.print ( "\nName : " +s[i].name ) ;
		System.out.print ( "\nAge : " +s[i].age ) ;
		System.out.print ( "\nScore : " +s[i].score ) ;
	  }
	}
		
    System.out.print ( "\n" ) ;		
	System.out.println("\nStudents who scored between [50-65]: ");
	for(int i=0; i<4; i++)
	{
	  if(s[i].score>=50 && s[i].score<65)
	  {
	    System.out.print ( "Roll Number : " +s[i].roll_no ) ;
		System.out.print ( "\nName : " +s[i].name ) ;
		System.out.print ( "\nAge : " +s[i].age ) ;
		System.out.print ( "\nScore : " +s[i].score ) ;
	  }
	}
		
    System.out.print ( "\n" ) ;		
	System.out.println("\nStudents who scored between [45-50]: ");
	for(int i=0; i<4; i++)
	{
	  if(s[i].score>=45 && s[i].score<50)
	  {
	    System.out.print ( "Roll Number : " +s[i].roll_no ) ;
		System.out.print ( "\nName : " +s[i].name ) ;
		System.out.print ( "\nAge : " +s[i].age ) ;
		System.out.print ( "\nScore : " +s[i].score ) ;
	  }
	}
  }
}