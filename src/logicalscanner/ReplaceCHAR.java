package logicalscanner;

import java.util.Scanner;

public class ReplaceCHAR {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter string with spcl char");
	String name= s.next();
	String correctname= name.replace("s","e" );
	System.out.println(correctname);
	
}
}
