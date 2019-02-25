package lesson17Arrays;
import java.util.Scanner;
public class namePrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("how many names do you want to enter");
		Scanner scan=new Scanner(System.in);
		String names[]=new String[scan.nextInt()];
		scan.nextLine();
		for (int i=0;i<names.length;i++){
			System.out.println("enter name "+(i+1));
			String name=scan.nextLine();
			names[i]=name;
		}
		for (int i=0;i<names.length;i++)
			System.out.println((i+1)+". "+names[i]);
	}

}
