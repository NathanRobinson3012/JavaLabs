package lab8;

public class Runner {
	
	public static void process(Account acc) {
		acc.interest();
	}
	
	private static void action (int x) {
		x++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 100;
		action(k);
		System.out.println(k);

		Account acc = new Account(8941684,"me",100);
		Account bank = new Account(6548945, "you", 200);
		//Account bank = acc;
		
		//acc.deposit(200);
		//acc.withdrawl(400);
		//acc.interest();
		process(acc);
		acc.details();
		
		//bank.interest();
		process(bank);
		bank.details();
		
	}

}
