import java.util.Scanner;

public class CalcRoot{
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no to find its square root");
		n=scan.nextInt();
		squareRoot(n);
	}

	private static void squareRoot(int n) {
		double rootvalue=1;
		double num=n;
		for(int i=0;i<num;i++){
			rootvalue = 0.5 * (rootvalue+num/rootvalue);
		}
		System.out.println("Root Value Calculated : " + rootvalue);

		
	}
}