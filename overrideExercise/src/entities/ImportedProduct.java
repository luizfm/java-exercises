package entities;

public class ImportedProduct extends Product {
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
		super.setPrice(totalPrice());
	}
	
	public Double getCustomsFee() {
		return customsFee;
	}
	
	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return super.getPrice() + this.customsFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.priceTag());
		sb.append(" (Customs fee: $ " + String.format("%.2f", customsFee) + ")");
		return sb.toString();
	}
}
