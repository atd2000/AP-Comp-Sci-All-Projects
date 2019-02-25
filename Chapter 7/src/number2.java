import java.util.Scanner;
public class number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Numba Too
		
		Scanner tScore = new Scanner(System.in);
		System.out.println("Test 1 grade?");
		double test1 = tScore.nextDouble();
		System.out.println("Test 2 grade?");
		double test2 = tScore.nextDouble();
		System.out.println("Test 3 grade?");
		double test3 = tScore.nextDouble();
		System.out.println("Test 1 grade : " + (int)test1 + "\n" + "Test 2 grade : " + (int)test2 + "\n" + "Test 1 grade : " + (int)test3);
		System.out.println("Average : " + (test1 + test2 + test3)/3);
		
		
		
	}

}
