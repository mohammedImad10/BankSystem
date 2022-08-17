package BankSystem;

public class Log {
	private long timeStamp;
	private int clientId;
	private String description;
	private float amount;
	
	public Log(long timeStamp, int clientId, String description, float amount){
		
		this.timeStamp = timeStamp;
		this.clientId = clientId;
		this.description = description;
		this.amount = amount;
		
	}
	
	public String getData() {
		
		return "" + this.timeStamp + ", " + this.clientId + ", " + this.description + ", " + this.amount;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Client Id: " + this.clientId + " " + this.description + " " + this.timeStamp;
	}
	
	
}
