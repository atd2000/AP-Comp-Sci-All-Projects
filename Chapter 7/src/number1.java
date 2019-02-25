import java.util.Scanner;

public class number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Numba Wan
		Scanner radScan = new Scanner(System.in); 
		System.out.println("Radius?");
		double rad = radScan.nextDouble();
		System.out.println("Radius is " + Math.PI * (rad*rad));
		
	}

}
