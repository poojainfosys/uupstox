package prac;

public class Rvno {
public static void main(String[] args) {
	int k=1234;
	int rev=0;
	int r=0;
	while(k>0) {
		r=k%10;
		rev=rev*10+r;
		k=k/10;
	}
	System.out.println(rev);
	}
}

