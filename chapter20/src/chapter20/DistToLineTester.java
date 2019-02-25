package chapter20;
import java.util.Scanner;
public class DistToLineTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inScan=new Scanner(System.in);
		System.out.println("Enter A");
		DistToLine.A=inScan.nextDouble();
		System.out.println("Enter B");
		DistToLine.B=inScan.nextDouble();
		System.out.println("Enter C");
		DistToLine.C=inScan.nextDouble();
		System.out.println("Enter x cooridinate");
		double x=inScan.nextDouble();
		System.out.println("Enter y cooridinate");
		double y=inScan.nextDouble();
		System.out.println("Distance from point to the line is " + DistToLine.getDist(x, y));
	}

}
