package entities;

public class OutsourcedWorker extends Worker {
	
	private static final double ADDITIONAL_TAX = 1.1;
	
	private Double additionalCharge;
	
	public OutsourcedWorker() {
		super();
	}
	
	public OutsourcedWorker(String name, Integer hour, Double hourRate, Double additionalCharge) {
		super(name, hour, hourRate);
		this.additionalCharge = additionalCharge;
	}
	
	public double getAdditionalCharge() {
		return additionalCharge;
	}
	
	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		double additionalPayment = additionalCharge * ADDITIONAL_TAX;
		return super.payment() + additionalPayment;
	}
}
