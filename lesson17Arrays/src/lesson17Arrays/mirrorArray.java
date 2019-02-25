package lesson17Arrays;

public class mirrorArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []g= {7,6,4,2,5,9};
		int []a= new int [g.length];
		for (int i =0;i<g.length;i++)
			a[i]=g[g.length-(i+1)];
		for (int i =0;i<g.length;i++)
			System.out.println(a[i]);
		
	}

}
