package BankSystem;

public class PlatinumClient extends Client{
	protected final float commissionRate = (float) 0.01;
	protected final float interestRate = (float) 0.05;
	
	public PlatinumClient(int id, String name, float balace) {
		super(id, name, balace);
	
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CLient Type: Platinum, Client ID:" + this.getId()  ;
	}

}

