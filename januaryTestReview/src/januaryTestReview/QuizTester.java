package januaryTestReview;
public class QuizTester {

	public static void main(String[] args) {

		int[] nums1 = {1, 4, 8, 4, 2, 78, 3, 4};
		int[] nums2 = {2, 3, 4, 6, 2, 1};
		int[] nums3 = {3,6,3,7,9,10};
		int[] nums4 = {3, 6, 6};
		int[][] mdNums = {{1, 2, 3, 4, 5}, {5, 6, 7, 7}, {1, 8, 2}};
		String[][] mdEvens = {{"I", "want", "to", "be", "where", "the"}, {"people", "are", "I"}, {"want", "to", "see", "want", "to", "see'em", "danc'in"}};
		String[][] mdWords = {{"but", "the", "cat", "came", "back"}, {"the", "very", "next"}, {"day", "the", "cat", "came", "back"}};
		String[][] mdWords2 = {{"who", "aren't", "you'ze"}, {"I'm", "thethe", "manzes"}, {"cat", "who'ds", "knocks"}};
		String[][] mdWords3 = {{"who", "aren't", "you'ze"}, {"I'm", "thethe", "manzes"}, {"cat", "who'dss", "knocks"}};
		String[] dupes = {"asdf", "asdff", "asdfff", "asdfasdf", "asdff"};
		String[] dupes2 = {"asdf", "asdff", "asdfff", "asdfasdf", "asdffff"};
		String[][] mddupes = {{"1cat", "2cat", "3cat", "4cat"}, {"1dog", "2dog", "3dog"},{"2cat", "2whale", "3whale", "4whale"}};
		String[][] mddupes2 = {{"1cat", "2cat", "3cat", "4cat"}, {"1dog", "2dog", "3dog"},{"1whale", "2whale", "3whale", "4whale"}};
		
		
		
		//print1D
		System.out.println("print1D");
		MultiD.print1D(nums1);
		System.out.println("");
		
		//print2D
		System.out.println("print2D");
		MultiD.print2D(mdNums);
		System.out.println("");
		
		//compileArrays
		System.out.println("compileArrays");
		MultiD.print2D(MultiD.compileArrays(nums1, nums2, nums3));
		System.out.println("");
		
		//evenArray
		System.out.println("evenArray - Original Array");
		MultiD.print2D(mdEvens);
		System.out.println("evenArray - New Array - 3x3");
		MultiD.print2D(MultiD.evenArray(mdEvens));
	}
}
		
		