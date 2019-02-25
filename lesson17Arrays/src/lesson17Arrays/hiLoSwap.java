package lesson17Arrays;

public class hiLoSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hi,lo;
		int g[]= {-3,-6,-1,-8,-90,-3,-1,-8,-20};
		hi=0;
		lo=0;
		for (int i=0;i<g.length;i++){
			if (g[i]>g[hi]){
				hi=i;
			}
			if (g[i]<g[lo]){
				lo=i;
			}
			else 
				continue;
		}
		for (int i =0;i<g.length;i++){
			int tempVar=g[hi];
			g[hi]=g[lo];
			g[lo]=tempVar;
		}
		for (int i =0;i<g.length;i++)
			System.out.println(g[i]);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (int i =0;i<g.length;i++){
			System.out.println(g[i]);
		}
		
		
	}

}
