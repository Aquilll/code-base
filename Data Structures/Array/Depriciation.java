import java.util.Scanner;


public class Depriciation {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	double cost = 0;
	double rate = 0;
	double time = 0;
	double depriciation = 0;
	System.out.println("Enter the cost :");
	cost = s.nextDouble();
	System.out.println("Enter the rate :");
	rate = s.nextDouble();
	System.out.println("Enter the time :");
	time = s.nextDouble();
	depriciation=cost*Math.pow((1-rate/100),time);
	System.out.println("The depriciation is :" + depriciation);
}
}
