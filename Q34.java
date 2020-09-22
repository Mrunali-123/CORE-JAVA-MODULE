import java.util.Scanner;
class circle{
	private int radius;
	private double area;
	
	public void init(int r){
		this.radius = r;
	}
	
	public void calculate(){
		area = 3.14*radius*radius;
	}
	
	public void display(){
		System.out.println("Radius-->"+radius);
		System.out.println("Area-->"+area);
	}
}

class Q34
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		circle c = new circle();
		System.out.println("Enter radius");
		int Radius = sc.nextInt();
		c.init(Radius);
		c.calculate();
		c.display();
	}
}