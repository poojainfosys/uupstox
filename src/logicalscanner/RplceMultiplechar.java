package logicalscanner;

public class RplceMultiplechar {
public static void main(String[] args) {
	String name="v@ibh@v";
	String correctname= name.replaceAll("[^a-z A-Z]","a");
	System.out.println(correctname);
}
}
