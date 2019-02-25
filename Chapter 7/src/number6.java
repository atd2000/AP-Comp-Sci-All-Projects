import java.util.Scanner;
public class number6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nScan = new Scanner(System.in);
		System.out.println("Please enter your \"A\" value");
		Double a = nScan.nextDouble();
		System.out.println("Please enter your \"B\" value");
		Double b = nScan.nextDouble();
		System.out.println("Please enter your \"C\" value");
		Double c = nScan.nextDouble();
		System.out.println("+ = " + ((-1 * b) + ((Math.sqrt(Math.pow(b, 2)-4*a*c)))/2));
		
	}

}
