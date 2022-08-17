package BankSystem;

public class Account {
	private int id;
	private float balance;
	
	public Account(int id, float balance) {
		
		this.id = id;
		this.setBalance(balance);
	}

	public int getId() {
		return id;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
		
	}
	
	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (o == this) {
            return true;
        }
 
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Account)) {
            return false;
        }
         
        // typecast o to Complex so that we can compare data members
        Account c = (Account) o;
		if (this.id == c.id)
			return true;
		return false;
	}
	
}
