
public class BankTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount s= new SavingsAccount(1000, 7);
		s.deposit(500);
		System.out.println(s.superGetBalance());
		
		
		
	}

}
