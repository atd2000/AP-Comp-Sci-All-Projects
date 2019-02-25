import java.util.Scanner;
import java.util.Random;

public class RandomVerifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random synth = new Random();
		int[] hold = new int[10];
		int rand;
		for (int i = 0; i < hold.length; i++) {
			for (int e = 0; e < 9999; e++) {
				rand = synth.nextInt(10);
				hold[i] = rand;
			}
			i++;
		}
		for (int i=0; i<hold.length;i++)
			System.out.println((i+1)+ ".) "+ hold[i]+ " ");
	}

}
