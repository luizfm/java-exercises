package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem() {};
	
	public OrderItem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	};
	
	public int getQuantity() {
		return this.quantity;
	};
	
	public double getPrice() {
		return this.price;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public double subTotal() {
		return price * quantity;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName());
		sb.append(", $" + String.format("%.2f", product.getPrice()));
		sb.append(", Quantity: " + quantity);
		sb.append(", Subtotal: $" + String.format("%.2f", this.subTotal()));
		return sb.toString();
	}
}
