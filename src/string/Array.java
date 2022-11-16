package string;

public class Array {
public static void main(String[] args) {
	String ar[]= new String[(5)];
	ar[0]="ganesh";
	ar[1]="suresh";
	ar[2]="mahesh";
	ar[3]="akash";
	ar[4]="ashish";
	System.out.println(ar[0]);
	try {
	System.out.println(ar[5]);
}
	catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("there is no data to fetch");
}
}
}