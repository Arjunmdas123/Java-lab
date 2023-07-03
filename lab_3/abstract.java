import java.util.*;
abstract class shape
{
 	int a,b;
 	abstract public void printarea();
}
class rectangle extends shape
{
	public int area_rect;
	public void printarea()
{
 	 Scanner s=new Scanner(System.in);
 	 System.out.println("enter the length and breadth of rectangle");
 	 a=s.nextInt();
 	 b=s.nextInt();
 	 area_rect=a*b;
 	 System.out.println("Length of rectangle "   +a+   "breadth of rectangle "+b);	
 	 System.out.println("The area ofrectangle is:"+area_rect);
 }
 }
class square extends shape
{
 	double area_sq;
 	public void printarea()
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the side of square");
	a=s.nextInt();
	area_sq=a*a;
	System.out.println("The area of square is:"+area_sq);
}
}
class circle extends shape
{
	double area_circle;
	public void printarea()
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the radius of circle");
	a=s.nextInt();
 	area_circle=(3.14*a*a);
 	System.out.println("Radius of circle"+a);
 	System.out.println("The area of circle is:"+area_circle);
 }
}
class shapeclass
{
	 public static void main(String[] args) 
{
	rectangle r=new rectangle();
	r.printarea();
	square sq=new square();
	sq.printarea();
	circle r1=new circle();
	r1.printarea();
}
}
