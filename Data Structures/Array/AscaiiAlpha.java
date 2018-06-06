import java.util.Scanner;


public class AscaiiAlpha {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter any ascii no:");
	int a=scan.nextInt();
	System.out.print(a+ "-> " + (char)a+"		");
}
}
