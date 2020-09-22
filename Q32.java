public class Q32
{
	static int count = 0;
	Q32(){
			count++;
		}	
	
	public static void main(String[] args){
		Q32 s1 = new Q32();
		Q32 s2 = new Q32();
		Q32 s3 = new Q32();
		Q32 s4 = new Q32();
		System.out.println("Number of object-->"+count);
	}
}
