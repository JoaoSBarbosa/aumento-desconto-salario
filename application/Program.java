package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		employee.setName("João da Silva");
		employee.setGrossSalary(6000);
		employee.setTax(1000);
		
		
		System.out.printf("Name: %s %nGross salary: %.2f %nTax: %.2f",employee.getName() , employee.getGrossSalary(), employee.getTax());
		
		
		System.out.println();
		System.out.printf("%nEmployee: %s, $ %.2f", employee.getName(),employee.netSalary());
		
		System.out.println();
		System.out.printf("%nWhitch percentage to increase salary ? ");
		double increse = sc.nextDouble();
		employee.increaseSalary(increse);
		sc.close();
	}

}
