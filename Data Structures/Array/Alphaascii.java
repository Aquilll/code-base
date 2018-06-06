import java.util.Scanner;

public class Alphaascii {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter any alphabhet :");
	String a=scan.nextLine();
    System.out.println("Ascii value is :"+a.codePointAt(0));
}
}
