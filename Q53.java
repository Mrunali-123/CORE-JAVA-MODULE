import java.util.*;

class Q53{
	public static void main(String args[]){
	String s="67, 89, 23, 67, 12, 55, 66";
	String[] arr=s.split(", ");
	int sum=0;
	for(int i=0;i<arr.length;i++){
	int n=Integer.parseInt(arr[i]);
	sum+=n;
	}
	System.out.println("sum = "+sum);
	System.out.println();
	}
	
}

