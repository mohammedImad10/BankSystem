package BankSystem;

public class GoldClient extends Client{
	
	protected final float commissionRate = (float) 0.02;
	protected final float interestRate = (float) 0.03;
	
	public GoldClient(int id, String name, float balace) {
		super(id, name, balace);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CLient Type: Gold, Client ID:" + this.getId()  ;
	}

}
