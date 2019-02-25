package lesson17Arrays;
import java.util.Scanner;
public class arrayLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[]nums= new int [25];
		//for (int i=0; i<nums.length ;i++)
			//nums[i]=i;
		
		//for (int i= 0; i<nums.length;i++)
			//System.out.println(nums[i]);
		
		//String []exp= {"your mom","your mother","suck"};
		
		
		//for (int i=2 ; i>=0;i--)
			//System.out.println(exp[i]);
		/*Scanner kbIn=new Scanner(System.in);
		System.out.println("How many grades do you need to enter?");
		int num =kbIn.nextInt();
		double sum=0;
		
		
		double []grades=new double[num];
		for (int i=0; i<grades.length;i++){
			System.out.println("Enter grade "+(i+1));
			grades[i]=kbIn.nextDouble();
			sum+=grades[i];
		
		}
		System.out.println("The average grade is " + sum/num);
		*/
		int []num= {4,2,6,3,9};
		int tempV=num[0];
		num[0]=num[2];
		num[2]=tempV;
		for (int i=0;i<num.length;i++)
			System.out.println(num[i]);
		
		
		
	}

}
