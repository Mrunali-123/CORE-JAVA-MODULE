import java.util.*;

class Student{
	int roll;
	String name;
	int age;
	double score;
	Student(){}
	
	Student(int roll,String name, int age, double score){
			this.roll=roll;
			this.name=name;
			this.age=age;
			this.score=score;
	}
}
public class Q40{
public static void main(String srgs[]){
	Scanner sc=new Scanner(System.in);
	
	Student arr[]=new Student[5];
	for(int i =0; i<5; i++){
	        System.out.println("Enter the Student"+((i+1))+" name : ");
	        String name = sc.next();
	        System.out.println("Enter the Student"+(i+1)+" roll no : ");
	        int roll = sc.nextInt();
	        System.out.println("Enter the Student"+(i+1)+" age : ");
	        int age = sc.nextInt();
	        System.out.println("Enter the Student"+(i+1)+" score : ");
	        double score = sc.nextDouble();
	        Student s = new Student(roll,name, age,score);
	        arr[i] = s;
	    }
	
	for(Student item:arr){
		System.out.println("Name = "+item.name+" Roll no = "+item.roll+" Age = "+item.age+ " Score = "+item.score);
	} 
	
 System.out.println("Score Group [0-50] : ");
	    for(int i =0 ; i<arr.length; i++){
	        if(arr[i].score < 50.00 )
	            System.out.println("Name : "+arr[i].name+", Roll : "+arr[i].roll+", Age : "+arr[i].age+", Score : "+arr[i].score);
	    }
	    System.out.println("Score Group [50-65] : ");
	    for(int i =0 ; i<arr.length; i++){
	        if(arr[i].score >= 50.00 && arr[i].score < 65.00 )
	            System.out.println("Name : "+arr[i].name+", Roll : "+arr[i].roll+", Age : "+arr[i].age+", Score : "+arr[i].score);
	    }
	    System.out.println("Score Group [65-80] : ");
	    for(int i =0 ; i<arr.length; i++){
	        if(arr[i].score >= 65.00 && arr[i].score < 80.00 )
	            System.out.println("Name : "+arr[i].name+", Roll : "+arr[i].roll+", Age : "+arr[i].age+", Score : "+arr[i].score);
	    }
	    System.out.println("Score Group [80-100] : ");
	    for(int i =0 ; i<arr.length; i++){
	        if(arr[i].score >= 80.00 && arr[i].score <= 100.00 )
	            System.out.println("Name : "+arr[i].name+", Roll : "+arr[i].roll+", Age : "+arr[i].age+", Score : "+arr[i].score);
	    }
	}
}
	
	
	
	
	

