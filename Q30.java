import java.util.Scanner;
class Q30
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int sum = 0;
		System.out.println("Enter array element");
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for(int[] a:arr){
			for(int x:a){
				System.out.print(x+" ");
			}
			System.out.println();
		}
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(i==j) sum = sum + arr[i][j];
			}
		}
		System.out.println("Sum-->"+sum);
	}
}