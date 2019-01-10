import java.util.*;
public class CompoundInterest {
public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 
     double principal = 0;
     double rate = 0;
     double time = 0;

     double compoundInterest = 0;
  
     System.out.print("Enter the Principal amount : "); 
     principal = s.nextDouble();

     System.out.print("Enter the Rate : "); 
     rate = s.nextDouble();

     System.out.print("Enter the Time : "); 
     time = s.nextDouble();

     compoundInterest = principal * Math.pow((1 + rate/100),time); 
     System.out.println("");
     System.out.println("The Compound Interest is : "
    + compoundInterest);
  

}

}
