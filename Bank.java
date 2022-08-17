package BankSystem;

import java.util.Iterator;

class Bank {

	private static Client[] clients = new Client[100];
	private static Logger logService;
	private static Bank bankInstance = null;
	private static float totalCommission;
	private static float bankBalance;
	
	
	private Bank() {
		
	}
	
	public static Bank getInstance() {
		if(bankInstance == null)
			bankInstance = new Bank();
		return bankInstance;
	}
	
	public void setClients(Client[] clients) {
		Bank.clients = clients;
	}

	
	public void printClientList() {
		System.out.println(this.toString());
	}
	
	public static void setBalanc() {
		float sum = 0;
		for (int i = 0; i < Bank.clients.length; i++) {
			sum += clients[i].getFortune();
		}
		Bank.bankBalance = (sum / Bank.clients.length) + Bank.totalCommission;
	}
	
	public static float getBalance() {
		return Bank.bankBalance;

	}

	public void addClient(Client client) {
		for (int i = 0; i < Bank.clients.length; i++) {
			if (Bank.clients[i] == null) {
				Bank.clients[i] = client;
				break;
			}
			Bank.logService.getLogs();

		}
	}
	
	public static void updateTotalCommission(float commission) {
		Bank.totalCommission = commission;
	}
	
	public static void removeClient(Client client) {
		for (int i = 0; i < clients.length; i++) {
			if(Bank.clients[i].equals(client))
				Bank.clients[i] = null;
		}
		
		Bank.logService.getLogs();

	}

	public Client[] getClients() {

		// TODO write code
		return Bank.clients;
	}

	public void startAccountUpdater() {
		
	}

	public static float getTotalCommission() {
		return totalCommission;
	}

	
}
