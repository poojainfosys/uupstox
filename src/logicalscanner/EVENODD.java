package logicalscanner;

import java.util.Scanner;

public class EVENODD {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter num");
	int num=s.nextInt();
	if(num%2==0) {
		System.out.println("given no is even");
	}
	else {
		System.out.println("odd");
	}
}
}
