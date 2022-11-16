package inheretanceHIERARCHY;

public class ULC {
public static void main(String[] args) {
	D3 d= new D3();
	System.out.println("prop of d3");
	d.compact();
	
	
	System.out.println("prop of d2");
	D2 d2= new D2();
	d2.nailpaint();
	d2.money();
	
	System.out.println("prop of d1");
	D1 d1= new D1();
	d1.lipstick();
	d1.money();
}
}
