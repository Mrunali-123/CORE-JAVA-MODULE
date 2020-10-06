

import java.util.*;

class Tile{
    double edge;
    double Area;
    
    Tile(){
        
    }
    
    Tile(double edge){
        this.edge = edge;
        this.Area = edge * edge;
    }
    
}

class Floor{
    double l;
    double w;
    double Area;
    
    Floor(){
        
    }
    
    Floor(double l, double w){
        this.l = l;
        this.w = w;
        this.Area = l * w;
    }
    
    public int totalTiles(Tile t){
        int total = (int) (this.Area/t.Area);
        return total;
    }
}

public class Q42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter edge of tile");
		int e=sc.nextInt();
		System.out.println("enter length of floor");
		int a=sc.nextInt();
		System.out.println("enter width of floor");
		int b=sc.nextInt();
		 
	    Tile t = new Tile(e);
	    Floor f = new Floor(a, b);
	    System.out.println("Total no of tiles required : "+f.totalTiles(t));
	}
}
