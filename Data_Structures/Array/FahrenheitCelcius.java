import java.util.Scanner;


public class FahrenheitCelcius {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	double fahrenheit = 0;
	double celsius = 0;
	double conversion = 0;
	System.out.println("Enter the temperature in Fahrenheit :");
	fahrenheit = s.nextDouble();
	celsius = (fahrenheit-32)*5/9;
	System.out.println("temperature in celsius is :"+celsius);
}
}
