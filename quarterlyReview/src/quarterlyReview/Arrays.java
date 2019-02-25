package quarterlyReview;

public class Arrays {

	public Arrays(){}
	
	public double addemUp(double[]a){
		double sum=0;
		for (int i=0;i<a.length;i++)
			sum+=a[i];
		return sum;
	}
	
	public double highest(double[]a){
		double high=a[0];
		for (int i=0;i<a.length;i++)
			if (a[i]>high)
				high=a[i];
		return high;
	}
	
	public double lowest(double[]a){
		double low=a[0];
		for (int i=0;i<a.length;i++)
			if (a[i]<low)
				low=a[i];
		return low;
	}
	
	public String[] append(String[]a, String b){
		String[]c=new String [a.length+1];
		c[a.length]=b;
		return c;
	}
	
	public double[] append(double[]a, double b){
		double[]c=new double [a.length+1];
		c[a.length+1]=b;
		return c;
	}
	
	public int indexOf(String[]a, String b){
		int tempInd=-1;
		for (int i=0;i<a.length;i++){
			if (b==a[i])
				tempInd=i;
			else continue;
		}
		return tempInd;
	}
	
	public int indexOf(double[]a, double b){
		int tempInd=-1;
		for (int i=0;i<a.length;i++){
			if (b==a[i])
				tempInd=i;
			else continue;
		}
		return tempInd;
	}
	
	public int multsOf(double[]a,double b){
		int count=0;
		for (int i=0;i<a.length;i++){
			if ((a[i]%b)==0)
				count++;
		}
		return count;
	}
	
	public double[] deleteThree(double[]a){
		int delCount=0;
		for (int i=0;i<a.length;i++){
			if (a[i]%3==0)
				delCount++;	
		}
		double b[]=new double[(a.length-delCount)];
		int e=0;
		for (int i=0;i<b.length;i++){
			if ((a[i]%3)==0){
				e++;
			}
			if (a[e]<a.length){
			b[i]=a[e];
			e++;
			}
		}	
		return b;
	}
	public void printA(double[]a){
		for (int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
	
	
	
	
	
}
