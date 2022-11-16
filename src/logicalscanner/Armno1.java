package logicalscanner;

public class Armno1 {
public static void main(String[] args) {
	int no= 154;
	int actno= no;
	int r=0;
	int armno=0;
	
	while(no>0) {
		r=no%10;
		armno=r*r*r+armno;
		no=no/10;
	}
	if(armno==actno) {
		System.out.println("no is armstng");
	}
	else {
		System.out.println("no is not armstng");
	}
}
}
