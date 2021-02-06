package entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public ImportedProduct() {
		super();
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return price+customsFee;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append(" $ ");
		sb.append(String.format("%.2f",getPrice()));
		sb.append(" (Customs fee: ");
		sb.append(String.format("%.2f",getCustomsFee()));
		sb.append(")");
		return sb.toString();
	}	
}
