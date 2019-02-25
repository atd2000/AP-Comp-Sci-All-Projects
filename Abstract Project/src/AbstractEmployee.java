
public abstract class AbstractEmployee {

	public String name = "jim";
	public double salary;

	public double getSalary() {
		return salary;
	}

	public double setSalary(double s) {
		salary = s;
		return salary;
	}

	public abstract String changeName(String name);

}
