package string;

public class Strng {
	public static void main(String[] args) {
		
	
String s1="velocity";
String s2="VELOCITY";
String s3="velo";
System.out.println(s1.length());

System.out.println(s1.toUpperCase());
System.out.println(s2.toLowerCase());
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s1.contains(s3));
System.out.println(s1.charAt(4));
System.out.println(s2.indexOf('V'));
System.out.println(s1.replace("city", "rural"));
System.out.println(s1.substring(4));
System.out.println(s1.concat(s3));

}
}