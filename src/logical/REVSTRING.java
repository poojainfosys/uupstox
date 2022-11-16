package logical;

public class REVSTRING {
public static void main(String[] args) {
	String s="nitin";
	String rev="";
	for(int i=s.length()-1; i>=0; i--) {
		rev= rev+s.charAt(i);
	}
	System.out.println(rev);
	if (s.equals(rev)) {
		System.out.println("given string is pallindrome");
	}
	else {
		System.out.println("given string isnot pallindrome");
	}
}
}
