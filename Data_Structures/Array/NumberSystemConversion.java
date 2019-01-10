
public class NumberSystemConversion {
public static void main(String[] args) {
	  DecimalBinary obj = new DecimalBinary();
	  DecimalOctal con = new DecimalOctal();
	  DecimalHex conv = new DecimalHex();
	  	//binary conversion
	     System.out.println("Binary representation of 124: ");
	     obj.convertBinary(124);
	     System.out.println("\nBinary representation of 45: ");
	     obj.convertBinary(45);
	     System.out.println("\nBinary representation of 999: ");
	     obj.convertBinary(999);
	     //octal conversion
	     System.out.println("\nOctal representation of 124: ");
	     con.convertBinary(124);
	     System.out.println("\nOctal representation of 45: ");
	     con.convertBinary(45);
	     System.out.println("\nOctal representation of 999: ");
	     con.convertBinary(999);
	    //Hexadecimal conversion
	     System.out.println("\nHexal representation of 124: ");
	     conv.convertBinary(124);
	     System.out.println("\nHexal representation of 45: ");
	     conv.convertBinary(45);
	     System.out.println("\nHexal representation of 999: ");
	     conv.convertBinary(999);
	  }
}
