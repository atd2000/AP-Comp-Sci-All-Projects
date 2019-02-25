import java.util.Scanner;

public class Crypto {

	String input = "";

	public Crypto() {
	}

	public String encrypt() {
		Crypto test = new Crypto();
		Scanner kbIn = new Scanner(System.in);
		System.out.println("What do you want to encrypt?");
		input = kbIn.nextLine();
		String encIn = input;
		encIn = encIn.replaceAll("m", "ssad");
		encIn = encIn.replaceAll("M", "ssad");
		encIn = encIn.replaceAll("g", "je..w");
		encIn = encIn.replaceAll("G", "je..w");
		encIn = encIn.replaceAll("b", "dug>/");
		encIn = encIn.replaceAll("B", "dug>/");
		encIn = encIn.replaceAll("v", "ag'r");
		encIn = encIn.replaceAll("V", "ag'r");
		encIn = encIn.replaceAll("je..w", "jeb..w");
		return "Encrypted Message: " + encIn;
	}

	public String decrypt() {
		if (input.equals("")){
			System.out.println("No encryptions.");
		return input;	
		}
		else {
			Crypto test = new Crypto();
			System.out.println("Decrypting previous entry.");
			String encIn = input;
			encIn = encIn.replaceAll("ssad", "m");
			encIn = encIn.replaceAll("jeb..w", "g");
			encIn = encIn.replaceAll("ag'r", "v");
			encIn = encIn.replaceAll("dug>/", "b");
			System.out.println("Decrypted message: " + encIn);
			return encIn;
		}
	}

	public void menu() {
		while (true) {
			Scanner menuScan = new Scanner(System.in);
			System.out.println("What do you want to do?\n1. Encrypt\n2. Decrypt\n3. Exit");
			int choice = menuScan.nextInt();
			if (choice == 1)
				System.out.println(encrypt());
			else if (choice == 2)
				System.out.println(decrypt());
			else if (choice==3){
				System.out.println("Exiting...");
				break;
			}
			else {
				System.out.println("error");
				break;
			}
		}
	}
}
