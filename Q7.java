import java.util.*;

   public class Q7{
        public static void main( String args[]){

   Scanner sc = new Scanner(System.in);
   System.out.println("enter number of sub.");

  int subjects = sc.nextInt();
   
  int sum=0;
  for(int i=0; i<subjects; i++){
   int marks = sc.nextInt();
   sum+= marks;
}
   int totalmarks = subjects*100;
 int per = (sum/ totalmarks)*100;
  System.out.println("percwntage is= "+per +"%");
}
}
