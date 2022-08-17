package BankSystem;

import java.util.List;

enum Rank{
	regular,gold,platinum
}

public abstract class Client {
	
	private int id;
	private Rank rank;
	private String name;
	private float balance;
	private Account[] accounts= new Account[5];
	protected final float commissionRate = 0;
	protected final float interestRate = 0;
	private Logger logger;
	
	public Client(int id,String name, float balace){
		
		this.id = id;
		this.setName(name);
		this.setBalance(balace);
		this.logger = new Logger(name);
		
	}
	
	public float getFortune() {
		return this.getAccountsBalanc() + this.balance;
	}
	
	public float getAccountsBalanc() {
		float totalBalance = 0;
		for(int i=0; i<this.accounts.length;i++) {
			totalBalance  += this.accounts[i].getBalance();
		}
		
		return totalBalance;
	}
	public void autoUpdateAccounts() {
		for(int i=0; i<this.accounts.length;i++) {
			this.accounts[i].setBalance(this.accounts[i].getBalance() + this.interestRate);
		
		}
		
	}
	
	public void deposit(float currentAmmount) {
		float ammountToDeposit = currentAmmount - (currentAmmount * this.commissionRate);
		this.balance += ammountToDeposit;
	}
	
	public void withdraw(float currentAmmount) {
		float ammountTWwithdraw = currentAmmount + (currentAmmount * this.commissionRate);
		this.balance -= ammountTWwithdraw;
	}
	
	
	public Boolean isIdinAccounts(int id) {
		for(int i=0; i<this.accounts.length;i++) {
			if(id == this.accounts[i].getId())
				return true;
		}
		return false;
	}
	
	public void addAccount(Account account) {
		if(this.isIdinAccounts(account.getId()))
			return;
		
		int currentLength = this.accounts.length;
		if( currentLength < 5) {
			this.accounts[currentLength] = account;
		}
	}
	
	public Account getAccount(int id) {
		for(int i=0; i<this.accounts.length;i++) {
			if(id == this.accounts[i].getId())
				return this.accounts[i];
		}
		return null;
	}
	
	public void removeAccount(Account account) {
		int accountIndex = 0 ;
		Account currentAcount = account;
		if(currentAcount != null) {
			for(int i=0; i<this.accounts.length;i++) {
				if(this.accounts[i].equals(currentAcount)){
					accountIndex = i;
				}				
			}			
		}
		this.balance += currentAcount.getBalance();
		this.accounts[accountIndex]=null;
		
	}
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public Account[] getAccounts() {
		return accounts;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	

}
