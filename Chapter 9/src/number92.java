import java.util.Scanner;
public class number92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nScan = new Scanner(System.in);
		System.out.println("Input a number.");
		int numIn =nScan.nextInt();
		if ((numIn % 3) == 0){
			System.out.println("Fizz");
		}
		else if ((numIn % 5) == 0){
			System.out.println("buzz");	
		}
		else if ((numIn % 5) == 0 && ((numIn % 3) == 0)){
			System.out.println("fizzbuzz");	
		}
		
		
		
		
	}

}
