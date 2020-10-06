 
 import java.util.*;
 class OneBHK{
	double rArea;
	double hArea;
	double price;
	
	OneBHK(){
	
	}
	
	OneBHK(double rArea, double hArea, double price){
		this.rArea=rArea;
		this.hArea=hArea;
		this.price=price;
	}
	void show(){
		System.out.println("Room Area = "+this.rArea+" Hall Area = "+this.hArea+" Price = "+this.price );
	}
	
	
 }
 class TwoBHK extends OneBHK{
	double r2Area;
	 
	TwoBHK(){}

	TwoBHK(double rArea, double hArea, double price,  double r2Area){
		super(rArea,hArea,price);
		this.r2Area=r2Area;
	}
	
	void show(){
		super.show();
		System.out.println("Room2 Area = "+this.r2Area);
	}
	
}
public class Q43{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double total=0.00;
		TwoBHK arr[]= new TwoBHK[3];
		for(int i=0;i<arr.length;i++){
		System.out.println("Enter the details of the flat:");
		System.out.println("Enter Room1 Area :");
		double r1A=sc.nextDouble();
		System.out.println("Enter Hall Area :");
		double hA=sc.nextDouble();
		System.out.println("Enter Room2 Area :");
		double r2A=sc.nextDouble();
		System.out.println("Enter Price :");
		double p=sc.nextDouble();
		
		total+=p;
		
		TwoBHK t=new TwoBHK(r1A,hA,p,r2A);
		arr[i]=t;
		}
		
		for(int i=0;i<arr.length;i++){
		arr[i].show();
		System.out.println("total Amount of Flats :"+total);
			
		}
		
		
		
	}
}
 