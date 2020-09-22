import java.util.Scanner;

class student
{
	private int rno;
	private String name;
	
	public void setData(int rollNo, String Name){
		rno = rollNo;
		name = Name;
		System.out.println("Data set");
	}
	
	public void showData(){
		System.out.println("Roll no-->"+rno);
		System.out.println("Name-->"+name);
		
	}
}

class Q31
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		student s = new student();
		System.out.println("Enter roll no & student");
		int rollNo = sc.nextInt();
		String Name = sc.nextLine();
		s.setData(rollNo,Name);
		s.showData();
	}
}