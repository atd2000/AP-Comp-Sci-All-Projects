
public class PublicEmployee extends AbstractEmployee {

	public PublicEmployee() {
	}

	public String changeName(String nam) {
		name = nam;
		return name;
	}

	public void printName() {
		System.out.println(name);
	}

	public void getPaid() {
		System.out.println("You got that bread");
	}

}
