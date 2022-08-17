package BankSystem;

public class RegularClient extends Client{
	
	protected final float commissionRate = (float) 0.03;
	protected final float interestRate = (float)0.01;
	
	public RegularClient(int id, String name, float balace) {
		super(id, name, balace);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CLient Type: Regular, Client ID:" + this.getId()  ;
	}

}
