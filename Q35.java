import java.util.*;
import java.lang.Math; 


class MathOperation{
	public double add(double a,double b){
		double ans = a + b;
		return ans;
		//System.out.println("Add-->"+ans);
	}
	
	/*public void subtract(double a,double b){
		double ans = a - b;
		System.out.println("Subtract-->"+ans);
	}
	
	public void multiply(double a,double b){
		double ans = a * b;
		System.out.println("Multiply-->"+ans);
	}
	public void power(double a,double b){
		double ans = Math.pow(a,b);
		System.out.println("Power-->"+ans);
	}*/
}

class Q35
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		MathOperation m = new MathOperation();
		System.out.println("ans"+m.add(a,b));
		
		/*m.subtract(a,b);
		m.multiply(a,b);
		m.power(a,b);*/
	}
}