package chapter20;

public class DistToLine {

	static public double A=0;
	static public double B=0;
	static public double C=0;
	
	public static double getDist(double a, double b){
		return Math.abs(A*a+B*b+C)/Math.sqrt(Math.pow(A, 2)+Math.pow(B, 2));
	}
	
	
}
