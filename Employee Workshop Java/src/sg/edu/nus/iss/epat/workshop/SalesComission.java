package sg.edu.nus.iss.epat.workshop;

public class SalesComission {
	private float commissionRate;
	private int salesMade;
	public float getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(float commissionRate) {
		this.commissionRate = commissionRate;
	}
	public int getSalesMade() {
		return salesMade;
	}
	public void setSalesMade(int salesMade) {
		this.salesMade = salesMade;
	}
	public SalesComission(float commissionRate, int salesMade) {
		super();
		this.commissionRate = commissionRate;
		this.salesMade = salesMade;
	}
	
}
