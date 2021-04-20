package exFixacao_poli_her;

public final class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(Double customsFee, String name, Double price) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return super.getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() { //POLIMORFISMO - SOBRESCREVI O METODO
		return super.priceTag()
			   + " (Custums fee: $ " + String.format("%.2f", customsFee)+")";
	}
}
