package starpattern;

public class ROW3col4 {
public static void main(String[] args) {
	int star=1;
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=star; j--) {
			if(i==1&&j==1) {
				System.out.print("*");
		}
			
		System.out.println("");
		star++;
	}
}
}
}
