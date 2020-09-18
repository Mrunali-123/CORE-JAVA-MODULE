import java.util.*;
class Q19 {
	public static void main(String ar[]){
          Scanner x = new Scanner(System.in);
	    System.out.println("Enter number");
            int n = x.nextInt();
            int num = 2;
             int sum = 0;
           for(int i = 1 ; i <= n; i ++)
          {
           
             System.out.println("Square"+i*i);
             sum +=(i*i);
           }
              System.out.println();
              System.out.println("sum is "+sum);
          
           
           }  
	     
         }