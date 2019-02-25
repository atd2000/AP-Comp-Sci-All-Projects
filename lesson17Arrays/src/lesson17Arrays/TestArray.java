package lesson17Arrays;

public class TestArray {

	public TestArray(){}
	public double multiply(double []x){
		double product=1;
		for (int i=0;i<x.length;i++){
			product*=x[i];	
		}
		return product;
	}
}
