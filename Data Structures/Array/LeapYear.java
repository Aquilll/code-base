import java.util.Scanner;


public class LeapYear {
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	int y;
	do{
		y = read.nextInt();
	    if(IsLeapYear(y)){
	    	System.out.println(y + " is a leap year");
	    }else{
	    	System.out.println(y + " is not a leap year");
	    }
	     
	}while(y!=0);
}

private static boolean IsLeapYear(int year) {
    int xyz = year;
    if (year==0){
    	System.out.println("0 is not a year exiting .....");
        return false;
    }
        else if(xyz%4==0&&xyz%100!=0||xyz%400==0)
		return true;
	else
		return false;	
}
}