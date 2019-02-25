import java.util.Scanner;
import java.util.Random;

public class Magic8Ball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inScan = new Scanner(System.in);
		while (true) {
			System.out.println("what is your question?");
			String input = inScan.nextLine();
			Random ball = new Random();
			int rand = (ball.nextInt(7) + 1);
			if (rand == 1)
				System.out.println("hella yea\n");
			else if (rand == 2)
				System.out.println("prolly nah\n");
			else if (rand == 3)
				System.out.println("def nah fam\n");
			else if (rand == 4)
				System.out.println("thats an oof\n");
			else if (rand == 5)
				System.out.println("prolly yea\n");
			else if (rand == 6)
				System.out.println("dont get your hopes up on that one\n");
			else if (rand == 7)
				System.out.println("for sure fam\n");
			else if (rand == 8)
				System.out.println("woa thats the future man\n");
		}
	}
}