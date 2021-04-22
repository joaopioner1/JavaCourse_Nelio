package exFixacao_abstract;

public class NaturalPerson extends Person {
	
	private Double healthExpense;

	public NaturalPerson() {
	}
	
	public NaturalPerson(String name, Double annualIncome, Double healthExpense) {
		super(name, annualIncome);
		this.healthExpense = healthExpense;
	}

	public Double getHealthExpense() {
		return healthExpense;
	}

	public void setHealthExpense(Double healthExpense) {
		this.healthExpense = healthExpense;
	}

	@Override
	public Double calcTax() {
		Double percent = 0.0;
		if (super.getAnnualIncome() < 20000.00) {
			percent = (super.getAnnualIncome() * 15 + healthExpense * 50) / 100;
			return percent;
		} else {
			percent = (super.getAnnualIncome() * 25 - healthExpense * 50) / 100;
			return percent;
		}
	}
	
}
