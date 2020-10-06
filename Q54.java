import java.util.*;

class Q54{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String arr[]=str.split("");
		
		/*
		for(String str1:arr){
			System.out.println(str1);
		}
		*/
		String s="";
		for(int i=str.length()-1;i>=0;i--){
			s+=str.charAt(i);
		}
		System.out.println(s);
	}
}