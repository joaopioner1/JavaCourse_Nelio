package exFixacao_abstract;

public class LegalPerson extends Person {

	private Integer numberEmp;
	
	public LegalPerson() {
	}
	
	public LegalPerson(String name, Double annualIncome, Integer numberEmp) {
		super(name, annualIncome);
		this.numberEmp = numberEmp;
	}

	public Integer getNumberEmp() {
		return numberEmp;
	}

	public void setNumberEmp(Integer numberEmp) {
		this.numberEmp = numberEmp;
	}

	@Override
	public Double calcTax() {
		Double percent = 0.0;
		if (numberEmp < 10) {
			percent = super.getAnnualIncome() + 0.16;
			return percent;
		} else {
			percent = super.getAnnualIncome() * 0.14;
			return percent;
		}
	}
}
