/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("beach.jpg");
		// beach.explore();
		beach.zeroBlue();
		// beach.zeroRed();
		// beach.zeroGreen();
		beach.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	public static void convBnW() {

		Picture pic = new Picture("femaleLionAndHall.jpg");
		pic.explore();
		Pixel[][] picAry = pic.getPixels2D();
		for (Pixel[] rowAry : picAry) {
			for (Pixel objAry : rowAry) {
				double avg = objAry.getAverage();
				objAry.setBlue((int) avg);
				objAry.setGreen((int) avg);
				objAry.setRed((int) avg);
			}

		}
		pic.explore();

	}

	public static void adjustBrightness(double x) {

		Picture pic = new Picture("koala.jpg");
		pic.explore();
		Pixel[][] picAry = pic.getPixels2D();
		for (Pixel[] rowAry : picAry) {
			for (Pixel objAry : rowAry) {
				int high = objAry.getRed();
				double b = x;
				if (objAry.getRed() < objAry.getBlue() && objAry.getRed() > objAry.getGreen())
					high = objAry.getBlue();
				else if (objAry.getBlue() < objAry.getGreen() && objAry.getBlue() < objAry.getGreen())
					high = objAry.getGreen();
				if (high * x > 255)
					b = (255.0 / high);
				objAry.setRed((int) (objAry.getRed() * b));
				objAry.setBlue((int) (objAry.getBlue() * b));
				objAry.setGreen((int) (objAry.getGreen() * b));
			}

		}
		pic.explore();

	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}

	public static void verticalMirror() {

		Picture pic = new Picture("redMotorcycle.jpg");
		pic.explore();
		Pixel[][] twoD = pic.getPixels2D();
		for (int row = 0; row < twoD.length; row++){
			for (int col = 0; col < twoD[0].length / 2; col++) {
				twoD[row][(twoD[0].length-1) - col].setRed(twoD[row][col].getRed());
				twoD[row][(twoD[0].length-1) - col].setBlue(twoD[row][col].getBlue());
				twoD[row][(twoD[0].length-1) - col].setGreen(twoD[row][col].getGreen());
			}
		}
		pic.explore();
	}
	
	public static void horizontalMirror() {

		Picture pic = new Picture("redMotorcycle.jpg");
		pic.explore();
		Pixel[][] twoD = pic.getPixels2D();
		for (int row = 0; row < twoD.length; row++){
			for (int col = 0; col < twoD[0].length / 2; col++) {
				twoD[twoD.length-1 -row][col].setRed(twoD[row][col].getRed());
				twoD[twoD.length-1 -row][col].setBlue(twoD[row][col].getBlue());
				twoD[twoD.length-1 -row][col].setGreen(twoD[row][col].getGreen());
			}
		}
		pic.explore();
	}

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		horizontalMirror();
		//verticalMirror();
		// testZeroBlue();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		// convBnW();
		// vadjustBrightness(6);
		// testNegate();
		// testGrayscale();
		// testFixUnderwater();
		// testMirrorVertical();
		// testMirrorTemple();
		// testMirrorArms();
		// testMirrorGull();
		// testMirrorDiagonal();
		// testCollage();
		// testCopy();
		// testEdgeDetection();
		// testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
	}
}