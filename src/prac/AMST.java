package prac;

public class AMST {
public static void main(String[] args) {
	int num= 153;
	int actnum=num;
	int r=0; 
	int armnum=0;
	while(num>0) {
		r=num%10;
		armnum=r*r*r+armnum;
		num=num/10;
	}
	if(actnum==armnum) {
		System.out.println("amstng");
	}
	else {
		System.out.println("not arstng");
	}
}
}
