package chapter17review;
public class ClassTester {

	public static void main(String[] args) {
		Classroom compSci = new Classroom();
		compSci.addStudent("jack");
		compSci.classPopulation();
		compSci.listNames();
		compSci.addStudent("jack");
		compSci.addStudent("jacklyn");
		compSci.listNames();
		compSci.addStudent("dat boi");
		compSci.classPopulation();
		compSci.listNames();
		System.out.println(compSci.findStudent("jacklyn"));
		System.out.println(compSci.findStudent("George Boole"));
		System.out.println(compSci.removeStudent("jack"));
		System.out.println(compSci.removeStudent("mike"));
		compSci.listNames();
	}

}