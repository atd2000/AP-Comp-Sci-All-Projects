import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner aScan = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = aScan.nextInt();
		if (age >= 18){
			System.out.println("Awesome! You can drive alone.");
		}else{
			System.out.println("You need to wait " + (18-age) + " more years.");
			}
		
	}

}
