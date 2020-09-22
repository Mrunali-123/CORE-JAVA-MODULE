import java.util.*;
class person{
	private String name;
	private int age = 18;
	
	person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void display(){
		System.out.println("Name-->"+name);
		System.out.println("Age-->"+age);
	}
}

class Q37
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre name and age");
		String name = sc.nextLine();
		int age = sc.nextInt();
		person p = new person(name,age);
		p.display();	
	}
}