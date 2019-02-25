package januaryTestReview;

public class MultiD {

	public static void print1D(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}

	public static void print1D(String[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}

	public static void print2D(int[][] x) {
		for (int y = 0; y < x.length; y++) {
			for (int i = 0; i < x.length; i++)
				System.out.print(x[y][i] + " ");
		}
	}

	public static void print2D(String[][] x) {
		for (int y = 0; y < x.length; y++) {
			for (int i = 0; i < x[y].length; i++)
				System.out.print(x[y][i] + " ");
		}
	}

	public static int[][] compileArrays(int[] x, int[] y, int[] z) {
		int[][] compArray = new int[3][];
		compArray[0] = x;
		compArray[1] = y;
		compArray[2] = z;
		return compArray;
	}

	public static String[][] evenArray(String[][] words) {
		int lowLength = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i][0].length() < lowLength)
				lowLength = words[i][0].length();
			}
		String newArr[][] = new String[lowLength][];
		newArr[0] = words[lowLength];
		return newArr;
	}
}