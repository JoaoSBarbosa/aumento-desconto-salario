package entities;

public class Employee {
	
	private String name;
	private double tax, grossSalary;
	
	// Get Set name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// Get Set Salário inicial
	
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	// Get Set GrossSalary
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	// Metódos
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		double update = ((percentage / 100) + 1)* grossSalary - tax;
		System.out.printf("%nUpdated data: %s, $ %.2f", name, update);
	}
	
}


