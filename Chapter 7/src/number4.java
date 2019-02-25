import java.util.Scanner;
public class number4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner nScan = new Scanner(System.in);
		System.out.println("What is your name?");
		String wName = nScan.nextLine();
		System.out.println("Your name has " + wName.length() + " characters in it, how many would you like me to print?");
		int length = nScan.nextInt();
		System.out.println(wName.substring(0, length));
	}

}
