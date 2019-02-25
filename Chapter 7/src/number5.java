import java.util.Scanner;
public class number5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner vScan = new Scanner(System.in);
		System.out.println("Please enter your \"A\" value");
		Double a = vScan.nextDouble() ;
		System.out.println("Please enter your \"B\" value");
		Double b = vScan.nextDouble() ;
		System.out.println("Square root of " + a + " squared + " + b + " squared = " + (Math.sqrt((Math.pow(a,2)+ Math.pow(b,2)))));
		
		
	}

}
