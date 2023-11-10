package lab8;

public class Account {

	int id;
	String owner;
	double balance;
	
	public Account(int id,String owner,double balance) {
		this.id=id; this.owner=owner;this.balance=balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance +=amount;
			System.out.printf("the new balance on the account is £%.2f\n",balance);
		}
		else System.out.println("the input amount must be positive");
	}
	
	public void withdrawl(double amount) {
		if(balance-amount >= 0) {
			balance-=amount;
			System.out.printf("the new balance on the account is £%.2f\n",balance);
		}
		else {
			System.out.println("the amount on the account must be positive, you may not go into dept");
		}
	}
	
	public void details() {
		System.out.printf("account %d belonging to %s and has balance £%.2f\n",id,owner,balance);
	}
	
	public void interest() {
		this.balance*=1.025;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
