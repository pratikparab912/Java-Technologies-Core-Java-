import java.util.Scanner;

class Tile
{
  int tlength,twidth;
		
  Tile(int tlength,int twidth)
  {
	this.tlength=tlength;
	this.twidth=twidth;
  }
		
  int ttiles(int flength,int fwidth)
  {
    int tarea=tlength*twidth;
	int farea=flength*fwidth;
	int ttiles=(farea/tarea);
	return ttiles;
  }
}

//Floor

class Prog42
{
  int length,width,total;
  
  public static void main(String[] args)
  {	
	Scanner sc=new Scanner(System.in);
	Prog42 f=new Prog42();
			
	System.out.println("Enter length of the tile: ");
	f.length=sc.nextInt();
			
	System.out.println("Enter width of the tile: ");
	f.width=sc.nextInt();
	Tile t=new Tile(f.length,f.width);
			
			
	System.out.println("\n Enter length of the floor: ");
	f.length=sc.nextInt();
	
	System.out.println("Enter width of the floor: ");
	f.width=sc.nextInt();
			
	f.total=t.ttiles(f.length,f.width);
	System.out.println("\n Total tiles needed: "+f.total);		
  }
}